package top.faxuexiaoxin.question39

import scala.collection.mutable.ArrayBuffer

object question39 {

    def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
        //参数有效性判断
        if (candidates == null) {return List[List[Int]]()}

        //对candidates进行排序，这一步可以过滤重复的集合
        val array = candidates.sorted

        //保存最终答案用的链表
        var answer = ArrayBuffer[List[Int]]()
        //下面开始求数据
        for (i<- 0 until array.length){
            val newTarget = target - array(i)
            if(newTarget == 0) {
                answer += List(array(i))
            }else {
                val nextChain  = computeSum(array,i,newTarget)
                for (j<- nextChain){
                    answer += (List(array(i)) ::: j)
                }
            }
        }
        answer.toList
    }

    private def computeSum(array: Array[Int], startIndex: Int, target: Int): ArrayBuffer[List[Int]] ={
        //假定array已经排好序号
        val answer = ArrayBuffer[List[Int]]()
        for (i<-startIndex until array.length){
            val newTarget = target - array(i)
            if(newTarget == 0) {
                answer += List(array(i))
            }else if(newTarget < array(i)){
                //啥也不用做，因为这个时候已经找不到了对应的元素
            } else {
                val nextChain  = computeSum(array,i,newTarget)
                for (j<- nextChain){
                    answer += (List(array(i)) ::: j)
                }
            }
        }
        return answer
    }
}
