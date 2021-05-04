package top.faxuexiaoxin.question41

object question41 {

    private def swap(nums: Array[Int], i: Int, j: Int): Unit = {
        nums(i) = nums(i)^nums(j)
        nums(j) = nums(i)^nums(j)
        nums(i) = nums(i)^nums(j)
    }

    def firstMissingPositive(nums: Array[Int]): Int = {
        if(nums == null || nums.isEmpty){return 1}

        var index = 0
        for(i<- 0 until nums.length){
            //只对0-nums.length的数进行交换，交换到的位置是对应的数组的位置建议
            while(nums(i)>0 && nums(i)<nums.length && nums(nums(i)-1)!=nums(i)){
                swap(nums,nums(i)-1,i)
            }
        }

        for(i<- 0 until nums.length if nums(i)!= i+1){
            return i+1
        }
        return nums.length + 1
    }
}
