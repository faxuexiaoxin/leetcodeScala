package top.faxuexiaoxin.question32

import scala.collection.mutable

object question32 {
    def longestValidParentheses(s: String): Int = {
        //参数有效性检验
        if(s==null || s.size <2){return 0}

        //定义变量
        var maxLength = 0
        var currentLength = 0
        val stack = new mutable.Stack[Int]
        stack.push(-1)

        for(i<- 0 until s.length){
            if(s(i).equals('(')){
                stack.push(i)
            }else if (s(i).equals(')')){
                stack.pop()
                if(stack.isEmpty){
                    stack.push(i)
                }else{
                    currentLength = i -stack.top
                    maxLength = Math.max(currentLength,maxLength)
                }
            }else{
                throw new IllegalArgumentException("s含有其他特殊符号"+s(i))
            }
        }
        maxLength
    }

    def longestValidParentheses_leftAndRight(s: String): Int = {
        //参数有效性检验
        if(s==null || s.size <2){return 0}

        var left = 0
        var right = 0
        var maxLength = 0
        var currentLength = 0
        for(i<- s){
            if(i.equals('(')){
                left += 1
            }else if(i.equals(')')){
                right +=1
                if(left == right){
                    currentLength = left << 1
                }
                if(left < right) {
                    left = 0
                    right = 0
                }
                maxLength = currentLength.max(maxLength)
            }
        }
        left = 0
        right = 0
        for(i<- s.reverse){
            if(i.equals(')')){
                right += 1
            }else if(i.equals('(')){
                left += 1
                if(left == right){
                    currentLength = left <<1
                }
                if(left > right){
                    left = 0
                    right = 0
                }
                maxLength = currentLength.max(maxLength)
            }
        }
        maxLength
    }

}
