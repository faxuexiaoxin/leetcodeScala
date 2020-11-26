package top.faxuexiaoxin.question1074

import scala.collection.mutable

object question1074 {
    //最暴力的算法时间复杂度是O(n2m2) 空间复杂度是O(nm)
    def numSubmatrixSumTarget1(matrix: Array[Array[Int]], target: Int): Int = {
        //参数有效性的判断
        if(matrix==null||matrix.length ==0||matrix(0).length==0){
            throw new IllegalArgumentException("please input legal args")
        }

        //获得基本的参数
        val rows = matrix.length
        val cols = matrix(0).length
        val prefixArray = Array.ofDim[Int](rows,cols)

        var result = 0;
        var count = 0;

        //计算prefixArray prefixArray(i)(j)指的是(0,0) (i,j)之间的数字之和
        initPrefixArray(matrix, rows, cols, prefixArray)

        //下面计算点（a,b）->(c,d)之间的和
        for(a<-0 until rows;b<- 0 until cols;c<-a until rows;d<-b until cols){
            if(a==0 && b==0){
                result = prefixArray(c)(d)
            }else if(a==0 && b!=0){
                result = prefixArray(c)(d) - prefixArray(c)(b-1)
            }else if(a!=0 && b==0){
                result = prefixArray(c)(d) - prefixArray(a-1)(d)
            }else{
                result = prefixArray(c)(d) - prefixArray(a-1)(d) - prefixArray(c)(b-1) + prefixArray(a-1)(b-1)
            }
            if(result == target){
                count += 1
            }
        }
        return count
    }

    private def initPrefixArray(matrix: Array[Array[Int]], rows: Int, cols: Int, prefixArray: Array[Array[Int]]) = {
        for (i <- 0 until rows; j <- 0 until cols) {
            if (i == 0 && j == 0) {
                prefixArray(i)(j) = matrix(i)(j)
            } else if (i == 0) {
                prefixArray(i)(j) = prefixArray(i)(j - 1) + matrix(i)(j)
            }
            else if (j == 0) {
                prefixArray(i)(j) = prefixArray(i - 1)(j) + matrix(i)(j)
            }else{
                prefixArray(i)(j) = prefixArray(i -1)(j) + prefixArray(i)(j - 1) - prefixArray(i - 1)(j - 1) + matrix(i)(j)
            }
        }
    }

    def numSubmatrixSumTarget2(matrix: Array[Array[Int]], target: Int): Int = {
        //参数有效性的判断
        if(matrix==null||matrix.length ==0||matrix(0).length==0){
            throw new IllegalArgumentException("please input legal args")
        }

        //获得基本的参数
        val rows = matrix.length
        val cols = matrix(0).length
        val rowSum = Array.ofDim[Int](rows,cols)

        var count = 0
        //初始化rowSum rowSum(i,j)表示 第i行中 0 - j 的数字索引之和
        for(i<- 0 until rows;j<- 0 until cols){
            if(j==0){
                rowSum(i)(j) =  matrix(i)(j)
            }else{
                rowSum(i)(j) = rowSum(i)(j-1) + matrix(i)(j)
            }
        }

        //下面开始循环，计算起点是(c,i)(c,j)之间的和 也就是result
        for(i<- 0 until cols;j<- i until cols){
            var dict = new mutable.HashMap[Int,Int]()
            var result = 0

            for(c<- 0 until rows){
                if(i==0){
                    result += rowSum(c)(j)
                }else{
                    result += rowSum(c)(j) - rowSum(c)(i-1)
                }
                //如果当前小方块的指等于target
                if(target == result){
                    count +=1
                }
                //如果前面的result数据 存在 result - target的那么证明小方块也满足条件
                count += dict.getOrElse(result - target,0)
                //并把当前值加入到dict中
                dict.put(result,dict.getOrElse(result,0) + 1)
            }
        }
        return count
    }

    def main(args: Array[String]): Unit = {

        //第一种方法的测试
        val matrix = Array(Array(0,1,0),Array(1,1,1),Array(0,1,0))
        val target = 0
        val answer = numSubmatrixSumTarget1(matrix,target)
        println(answer)

        val matrix1 = Array(Array(1,-1),Array(-1,1))
        val target1 = 0
        val answer1 = numSubmatrixSumTarget1(matrix1,target1)
        println(answer1)

        //第二种方法的测试
        val matrix2 = Array(Array(0,1,0,0,1),Array(0,0,1,1,1),Array(1,1,1,0,1),Array(1,1,0,1,1),Array(0,1,1,0,0))
        val target2 = 1
        val answer2 = numSubmatrixSumTarget2(matrix2,target2)
        println(answer2)

        val matrix3 = Array(Array(0,1,1,1,0,1),Array(0,0,0,0,0,1),Array(0,0,1,0,0,1),Array(1,1,0,1,1,0),Array(1,0,0,1,0,0))
        val target3 = 0
        val answer3 = numSubmatrixSumTarget2(matrix3,target3)
        println(answer3)
    }

}
