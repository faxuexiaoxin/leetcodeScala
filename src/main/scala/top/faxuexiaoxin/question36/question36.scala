package top.faxuexiaoxin.question36

object question36 {
    def isValidSudoku(board: Array[Array[Char]]): Boolean = {
        // 验证参数有效性
        if(board == null || board.length!=9||board(0).length!=9){return false}

        //下面开始计算，
        val rows = Array.ofDim[Int](9,9)
        val cols = Array.ofDim[Int](9,9)
        val boxs = Array.ofDim[Int](9,9)
        initArray(rows)
        initArray(cols)
        initArray(boxs)

        for(i<- 0 until board.length; j<- 0 until board(0).length; if !board(i)(j).equals('.');c= board(i)(j) -'1' ){
            val boxIndex = (i / 3) * 3 +(j/3)
            if(rows(i)(c) == 0 && cols(j)(c) ==0 && boxs(boxIndex)(c)==0) {
                rows(i)(c) += 1
                cols(j)(c) += 1
                boxs(boxIndex)(c) += 1
            }else{
                return false
            }
        }
        return true
    }

    private def initArray(array: Array[Array[Int]]) = {
        for (i <- 0 until array.length; j <- 0 until array(0).length) {
            array(i)(j) = 0
        }
    }
}
