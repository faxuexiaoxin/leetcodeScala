package top.faxuexiaoxin.question42

object question42 {
    def trap(height: Array[Int]): Int = {
        if(height == null || height.isEmpty){return 0}

        var left = 0
        var right = height.length - 1
        var leftMax = height(left)
        var rightMax = height(right)
        var answer = 0
        while(left<=right){
            if(leftMax<rightMax){
                //计算left的宽度
                if(height(left) >= leftMax){
                    leftMax = height(left)
                }else{
                    answer += leftMax - height(left)
                }
                left += 1
            }else{
                if(height(right) >= rightMax){
                    rightMax = height(right)
                }else{
                    answer += rightMax - height(right)
                }
                right -= 1
            }
        }
        answer
    }
}
