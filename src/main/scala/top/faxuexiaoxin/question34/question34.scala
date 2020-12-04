package top.faxuexiaoxin.question34

object question34 {


    def searchRange(nums: Array[Int], target: Int): Array[Int] = {
        //参数有效性判断
        if (nums == null || nums.isEmpty) {return Array(-1,-1)}

        //查找左边的数据 和 查找右边的数据
        val left = findLeftData(nums,target)
        val right = findRightData(nums,target)
        Array(left,right)
    }

    private def findLeftData(nums: Array[Int], target: Int): Int = {

        var left = 0
        var right = nums.length -1

        while(left <= right){
            var mid = (left + right) >> 1
            if(nums(mid) == target){
                if(mid == 0 || nums(mid - 1) < target){
                    return mid
                }
                right = mid - 1
            }else if (nums(mid) > target){
                right = mid - 1
            }else{
                left = mid + 1
            }
        }
        return -1;
    }

    private def findRightData(nums: Array[Int], target: Int): Int = {

        var left = 0
        var right = nums.length -1

        while(left <= right){
            var mid = (left + right) >> 1
            if(nums(mid) == target){
                if(mid == nums.length -1  || nums(mid + 1) > target){
                    return mid
                }
                left = mid + 1
            }else if (nums(mid) > target){
                right = mid - 1
            }else{
                left = mid + 1
            }
        }
        return -1;
    }
}
