package top.faxuexiaoxin.question30

import scala.collection.mutable

object question30 {
    def findSubstring(s: String, words: Array[String]): List[Int] = {
        //判断参数是否合法
        val notAllow = JudgeArgs(s,words)
        if(!notAllow){return List[Int]()}

        //最后的返回值，用来表示答案
        val answer = mutable.ArrayBuffer[Int]()
        //需要的数据结构
        val map = mutable.HashMap[String,Int]()
        val queue = mutable.Queue[String]()

        //初始化map和queue
        initMap(words, map)

        //下面开始循环
        val length = words(0).length
        for(start<- 0 until length; currentWordStartIndex<- start until s.size by length){
            val currentWordEndIndex = currentWordStartIndex + length

            if(currentWordEndIndex > s.size){
                //说明这个长度不符合要求了，也就是最后一个了，要把所有的数据结构重置一下。
                //scala没有continue，或者要引入异常...算了，直接用else
                initMap(words,map)
                queue.clear()

            }else{
                //说明长度符合要求
                val singleWord = s.substring(currentWordStartIndex,currentWordEndIndex)

                if(!map.contains(singleWord)){
                    //不包含该单词的情况，直接充值map，和清理queue。
                    initMap(words,map)
                    queue.clear()
                }else{
                    if(map.get(singleWord).get == 0){
                        //表示当前的singleWord已经用完了，需要对队列做操作。
                        var tmp = queue.dequeue()
                        while(!tmp.equals(singleWord)){
                            map.put(tmp,map.get(tmp).get + 1)
                            tmp = queue.dequeue()
                        }
                        queue.enqueue(singleWord)
                    }else{
                        //表示还有多的singleWord所以可以不用变，直接加入就好了，
                        map.put(singleWord,map.get(singleWord).get - 1)
                        queue.enqueue(singleWord)
                    }
                    //如果是往队列里面装入元素，还需要判断，当前队列是否已满满了就是正确答案
                    if(queue.size == words.length){
                        val startIndex = currentWordEndIndex - words.length * length
                        answer.append(startIndex)
                    }
                }
            }

            //如果刚好弄好，进行到下一个。清理好数据。
            if (currentWordEndIndex >= s.size){
                initMap(words,map)
                queue.clear()
            }
        }
        answer.toList
    }

    private def initMap(words: Array[String], map: mutable.HashMap[String, Int]) = {
        map.clear()
        for (i <- words) {
            val currentValue: Int = map.getOrElse(i, 0)
            map.put(i, currentValue + 1)
        }
    }

    def JudgeArgs(str: String, strings: Array[String]):Boolean = {
        if(str == null || strings ==null||strings.isEmpty){
            return false;
        }
        val arrayLength = strings(0).size
        for(i<- strings if i.size!=arrayLength){
            return false;
        }
        return true
    }

    def main(args: Array[String]): Unit = {
//        def s = "ababababab"
//        def words = Array("ababa","babab")
//        var answer = findSubstring(s,words)
//        println(answer)
//
//        def s1 = "barfoothefoobarbar"
//        def words1 = Array("foo","bar")
//        var answer1 = findSubstring(s1,words1)
//        println(answer1)
//
//
//        def s2 = "wordgoodgoodgoodbestword"
//        def words2 = Array("word","good","best","word")
//        var answer2 = findSubstring(s2,words2)
//        println(answer2)

        def s3 = "abababab"
        def words3 = Array("ab","ba")
        var answer3 = findSubstring(s3,words3)
        println(answer3)
    }
}
