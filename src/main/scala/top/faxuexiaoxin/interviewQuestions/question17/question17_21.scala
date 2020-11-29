package top.faxuexiaoxin.interviewQuestions.question17

object question17_21 {

    private def caculateSum(height: Array[Int], startIndex: Int, maxNumberIndex: Int):Int = {
        //先不检查参数了

        //定义一些变量 最终的答案sum 和 高
        var sum = 0
        var high = Math.min(height(startIndex),height(maxNumberIndex))

        for(i<- startIndex+1 until maxNumberIndex){
            sum += high - height(i)
        }
        sum
    }

    def trap(height: Array[Int]): Int = {
        //检查参数有效性
        if(height ==null||height.isEmpty){return 0}

        //定义需要用到的变量
        var startIndex = 0
        var sum = 0
        //startIndex成为当前数组的最后一个时候，循环就可以结束了。而不是start<height.length
        while(startIndex < height.length - 1){
            //endIndex从startIndex+1开始
            var endIndex = startIndex + 1
            var maxNumberIndex = endIndex
            //endIndex对应的值如果比startIndex对应的值大，可以直接跳出循环 或者 endIndex对应的值一直比startIndex对应的值跳出循环
            //但是对应的最大的值，都保存在maxNumberIndex中。

            while (endIndex< height.length && height(endIndex) < height(startIndex)){
                endIndex += 1
                if(endIndex< height.length && height(endIndex) >= height(maxNumberIndex)){
                    maxNumberIndex = endIndex
                }
            }

//            计算maxNumberIndex与startIndex之间的值
            sum += caculateSum(height,startIndex,maxNumberIndex)

            startIndex = maxNumberIndex
        }
        return sum
    }

    def main(args: Array[String]): Unit = {
        val array = Array(0,1,0,2,1,0,1,3,2,1,2,1)
        val answer = trap(array)
        println(answer)
    }
}
