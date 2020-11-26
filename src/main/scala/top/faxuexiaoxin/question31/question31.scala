package top.faxuexiaoxin.question31

object question31 {
    def nextPermutation(nums: Array[Int]): Unit = {
        //参数有效性的判断
        if(nums == null|| nums.length<=1){return}

        //找到第一个需要交换的索引

        var i = nums.size - 1
        while(i>=1 && nums(i)<=nums(i-1)){
           i -= 1
        }
        //如果一直都是递减的顺序 5 4 3 2 1，那么逆序就好了
        if(i==0){
            reverse(nums,0,nums.length-1)
            return
        }

        var j =nums.size - 1
        while(j>=i && nums(j) <= nums(i-1)){
            j -= 1
        }

        //此时nums(j)> nums(i-1),交换nums(j)和nums(i-1)
        swap(nums,i-1,j)
        //然后对i nums.size-1 的列表重新排序
        sort(nums,i,nums.size-1)
    }

    def swap(array: Array[Int],index1:Int,index2:Int):Unit={
        val tmp = array(index1)
        array(index1) = array(index2)
        array(index2) = tmp
    }

    def sort(array: Array[Int],start:Int,end:Int):Unit={
       //冒泡排序，因为数组已经基本上有序了,假设start和end是符合要求的。
        for(i<- start until end){
            var min = i
            for(j<- i+1 to end){
                if(array(j)<array(i)){
                    min = j
                }
            }
            swap(array,i,min)
        }
    }

    def reverse(array: Array[Int],start:Int,end:Int):Unit={
        var i = start
        var j = end
        while(i<j){
            swap(array,i,j)
            i += 1
            j -= 1
        }
    }

    def main(args: Array[String]): Unit = {
        val s = Array(1,2,3)
        nextPermutation(s)
        s.foreach(x => println(x))
        println("--------")
        val s1 = Array(3,2,1)
        nextPermutation(s1)
        s1.foreach(x => println(x))
        println("--------")
        val s2 = Array(1,1,5)
        nextPermutation(s2)
        s2.foreach(x => println(x))
        println("--------")
        val s3 = Array(1)
        nextPermutation(s3)
        s3.foreach(x => println(x))




    }
}
