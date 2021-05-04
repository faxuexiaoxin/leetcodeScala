package top.faxuexiaoxin.question1550

object question1550 {
    def threeConsecutiveOdds(arr: Array[Int]): Boolean = {
        if(arr ==null || arr.length <3){
            return false
        }

        var count = 0
        for(i<- arr){
            if((i & 1)==0){
                count = 0
            }else{
                count +=1
                if(count >= 3){
                    return true
                }
            }
        }
        false
    }
}
