package top.faxuexiaoxin.interviewQuestions.question17

object question17_10 {
    def majorityElement(nums: Array[Int]): Int = {
        //参数进行验证
        if(nums == null || nums.isEmpty){ return -1 }

        //只有一个元素的情况，必定是多数元素
        if(nums.length ==1 ){return  nums(0)}

        //多个元素的情况,max表示可能是多数元素的值,count表示下一个元素与max不相同应该每次削减的个数....有点不好解释了
        var max = 0
        var count = 0
        for(i<- nums){
            if(count == 0){
                max = i
                count += 1
            }else{
                if(i == max){
                    count +=1
                }else{
                    count -=1
                }
            }
        }
        //最后对这个max进行验证，看是不是漏网之鱼
        count = 0
        for(i<- nums if i == max){
            count +=1
        }
        if(count > (nums.length >> 1)){
            return max
        }else{
            return -1
        }
    }

    def main(args: Array[String]): Unit = {
        val array = Array(1,2,5,9,5,9,5,5,5)
        val answer = majorityElement(array)
        println(answer)

        val array1 = Array(3,2,1)
        val answer1 = majorityElement(array1)
        println(answer1)

        val array2 = Array(2,2,1,1,1,2,2)
        val answer2 = majorityElement(array2)
        println(answer2)

    }
}
