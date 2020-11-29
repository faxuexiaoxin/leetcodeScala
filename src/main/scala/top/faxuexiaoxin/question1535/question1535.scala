package top.faxuexiaoxin.question1535

import scala.collection.mutable

object question1535 {
    def getWinner(arr: Array[Int], k: Int): Int = {
        //检查参数有效性
        if(arr==null || arr.length <= 1|| k<1){throw new IllegalArgumentException("数据输入错误")}

        //新建一个队列保存数据
        var firstData = arr(0)
        var secondData = arr(1)
        var count = 0
        val max = arr.max
        val queue = new mutable.Queue[Int]()
        for(i<- 2 until arr.length){
            queue.enqueue(arr(i))
        }

        //下面开始模拟过程
        while(count < k){

            if(firstData == max){
                return firstData
            }

            if(firstData>secondData){
                queue.enqueue(secondData)
                count += 1
            }else{
                queue.enqueue(firstData)
                firstData = secondData
                count = 1
            }
            secondData = queue.dequeue()
        }
        firstData
    }

    def main(args: Array[String]): Unit = {
        val arr = Array(2,1,3,5,4,6,7)
        val k = 2
        val answer = getWinner(arr,k)
        assert(answer == 5)

        val arr1 = Array(3,2,1)
        val k1 = 10
        val answer1 = getWinner(arr1,k1)
        assert(answer1 == 3)

        val arr2 = Array(1,9,8,2,3,7,6,4,5)
        val k2 = 7
        val answer2 = getWinner(arr2,k2)
        assert(answer2 == 9)

        val arr3 = Array(1,11,22,33,44,55,66,77,88,99)
        val k3 = 1000000000
        val answer3 = getWinner(arr3,k3)
        assert(answer3 == 99)
    }
}
