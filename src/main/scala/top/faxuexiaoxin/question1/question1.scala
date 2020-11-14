package top.faxuexiaoxin.question1

import scala.collection.mutable.HashMap

object question1 {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {

        //新建一个hashmap,key表示待匹配的数据，value表示原先对应的数组的序号。
        //比如 nums 2 7 11 15 target9
        //2对应的map=》 （7，0）
        val map =new HashMap[Int,Int]()
        val array = new Array[Int](2)
        for(i<- 0 until nums.length){
            val expect = target - nums(i)
            if(map.contains(expect)){
                array(0) = map.get(expect).get
                array(1) = i
                return array
            }else{
                map.put(nums(i),i)
            }
        }
        return null
    }

    def main(args: Array[String]): Unit = {
        val nums = Array(2,7,11,15)
        val target = 9
        val array = twoSum(nums,target)
        array.foreach(println(_))
    }
}
