package top.faxuexiaoxin.question37

import scala.collection.mutable

object question37 {

    val LENGTH= 9

    def solveSudoku(board: Array[Array[Char]]): Unit = {
        //参数有效性判断
        if(board == null || board.length != LENGTH || board(0).length != LENGTH){return}

        //定义相关的变量
        val rows = Array.ofDim[Int](9,9)
        val cols = Array.ofDim[Int](9,9)
        val boxs = Array.ofDim[Int](9,9)
        initRows(rows,board)
        initCols(cols,board)
        initBoxs(boxs,board)

        //选定需要第一个需要填入数字的元素
        val start = findNextData(board)
        for(i<- 0 until LENGTH){
            if (setElementValue(start._1,start._2,i,board,rows,cols,boxs)){
                return;
            }
        }
    }

    private def checkValue(row: Int, col: Int, value: Int, rows: Array[Array[Int]], cols: Array[Array[Int]], boxs: Array[Array[Int]]): Boolean = {
        val rowValid = rows(row)(value) == 0
        val colValid = cols(col)(value) == 0
        val boxIndex = (row / 3) * 3 + (col / 3)
        val boxValid = boxs(boxIndex)(value) == 0

        rowValid && colValid && boxValid
    }

    private def setElementValue(row: Int, col: Int, value: Int, array: Array[Array[Char]],
                                rows:Array[Array[Int]], cols:Array[Array[Int]], boxs:Array[Array[Int]]) :Boolean = {
        //参数检验
        val isCanUseThisValue = checkValue(row,col,value,rows,cols,boxs)

        if(isCanUseThisValue){
            //设置当前数组(i)(j)的值为'value'
            array(row)(col) = (value + '1').toChar
        //修改相关的集合和数组
            rows(row)(value) += 1
            cols(col)(value) += 1
            val boxIndex = (row / 3) *3 + (col / 3)
            boxs(boxIndex)(value) += 1
                //去设置下一个元素
            val start = findNextData(array)
            if(start == null){
                return true
            }
            for(i<- 0 until LENGTH){
                if (setElementValue(start._1,start._2,i,array,rows,cols,boxs)){
                    return true;
                }
            }
                //说明当前值是行不通的，那么重新恢复当前值的状态
            rows(row)(value) -= 1
            cols(col)(value) -= 1
            boxs(boxIndex)(value) -= 1
            array(row)(col) = '.'
        }

        return false;
    }

    private def findNextData(array: Array[Array[Char]]) :Tuple2[Int,Int]= {
        for(i<- 0 until LENGTH;j<- 0 until LENGTH if array(i)(j) == '.'){
            return (i,j)
        }
        return null
    }



    private def initRows(array: Array[Array[Int]],board:Array[Array[Char]]): Unit = {
        for (i <- 0 until array.length; j <- 0 until array(0).length ; if board(i)(j) != '.') {
            val value = board(i)(j) - '1'
            array(i)(value) = 1
        }
    }

    private def initCols(array: Array[Array[Int]],board:Array[Array[Char]]): Unit = {
        for (i <- 0 until array.length; j <- 0 until array(0).length ; if board(i)(j) != '.') {
            val value = board(i)(j) - '1'
            array(j)(value) = 1
        }
    }

    private def initBoxs(array: Array[Array[Int]],board:Array[Array[Char]]): Unit = {
        for (i <- 0 until array.length; j <- 0 until array(0).length ; if board(i)(j) != '.') {
            val value = board(i)(j) - '1'
            val boxIndex = (i/3)*3 + (j/3)
            array(boxIndex)(value) = 1
        }
    }

}
