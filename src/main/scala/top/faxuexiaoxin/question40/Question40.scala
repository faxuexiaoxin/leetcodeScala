package top.faxuexiaoxin.question40

import scala.collection.mutable.ArrayBuffer

object Question40 {
    def combinationSum2(candidates: Array[Int], target: Int): List[List[Int]] = {

        val newCandidates = candidates.sorted

        var result:ArrayBuffer[List[Int]] = ArrayBuffer()
        var i = 0
        while(i< candidates.length){

            val newTarget = target - newCandidates(i)
            if(newTarget == 0){
                result.append(List(target))
            }else{
                val subList = combinationSumUsingIndex(newCandidates, i+1, newTarget)
                for(j<- subList){
                    result.append(newCandidates(i) :: j)
                }
            }
            i = findNotEqualsIndex(newCandidates,i)
        }
        result.toList
    }
    //去拿从startIndex中并且之后等于target的值。
    def combinationSumUsingIndex(candidates:Array[Int],startIndex:Int,target:Int):ArrayBuffer[List[Int]] ={
        //candidates是有序数组

        val result:ArrayBuffer[List[Int]]= ArrayBuffer()
        var i = startIndex
        while(i< candidates.length) {
            if(candidates(i)==target){
                result.append(List(candidates(i)))
                i = findNotEqualsIndex(candidates,i)
            }else if(candidates(i)<target){
                var subResult = combinationSumUsingIndex(candidates,i+1,target-candidates(i))
                for(j<-subResult){
                    result.append(candidates(i) :: j)
                }
                i = findNotEqualsIndex(candidates,i)
            }else{
                //doNothing
                i +=1
            }
        }
        result
    }

    private def findNotEqualsIndex(array:Array[Int],index:Int):Int={
        val maxIndex = array.size
        var nextIndex = index
        val startValue = array(index)
        while(nextIndex<maxIndex){
            if(array(nextIndex)==startValue){
                nextIndex +=1
            }else{
                return nextIndex
            }
        }
        maxIndex
    }
}
