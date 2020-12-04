package top.faxuexiaoxin.question33

object question33 {
    def search(nums: Array[Int], target: Int): Int = {
        //对于参数进行处理
        if(nums == null || nums.isEmpty){
            return -1
        }

        val start = nums.head
        val end = nums.last

        var left = 0
        var right = nums.length - 1

        while(left <= right){
            val mid = (left + right)>>1
            if(nums(mid) == target){return mid}

            if(nums(mid) >= start){
                //说明左边是有序的
                if(nums(left) <= target && target< nums(mid)){
                    right = mid - 1
                }else{
                    left = mid + 1
                }
            }else{
                //说明右边是有序的
                if(nums(mid) <  target && target <= nums(right)){
                    left = mid + 1
                }else{
                    right = mid -1
                }
            }
        }
        return -1
    }
}
