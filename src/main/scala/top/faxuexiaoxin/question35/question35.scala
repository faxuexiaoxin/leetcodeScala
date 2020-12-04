package top.faxuexiaoxin.question35

object question35 {
    def searchInsert(nums: Array[Int], target: Int): Int = {
        if (nums == null) { return -1 }

        if(nums.isEmpty){return 0}

        var left = 0
        var right = nums.length - 1

        while(left <= right){
            var mid = (left + right ) >> 1
            if(nums(mid)==target){
                return mid
            }else if(nums(mid)>target){
                if(mid == 0 || mid >0 && nums(mid -1) < target){
                    return mid
                }else{
                    right = mid - 1
                }
            }else{
                if(mid == nums.length -1 || mid < nums.length -1 && nums(mid + 1)>target){
                    return mid + 1
                }else{
                    left = mid + 1
                }
            }
        }
        return -1
    }
}
