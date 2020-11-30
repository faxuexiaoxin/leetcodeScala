package top.faxuexiaoxin.question1588

object question1588 {
    def sumOddLengthSubarrays(arr: Array[Int]): Int = {
        //参数有效性检查
        if(arr == null){
            return 0
        }

        //需要用到的参数
        var count = 0;
        for(i<- 0 until arr.length){
            val left_even = (i+2)/2
            val left_odd = i+1 - left_even

            val right_even = (arr.length - i + 1) /2
            val right_odd = arr.length - i - right_even

            count += (left_even*right_even + left_odd * right_odd) * arr(i)
        }
        count
    }

    def main(args: Array[String]): Unit = {
        val array = Array(1,4,2,5,3)
        val answer = sumOddLengthSubarrays(array)
        println(answer,58)
    }
}
