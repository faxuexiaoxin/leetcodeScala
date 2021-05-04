package top.faxuexiaoxin.question38

object question38 {
    def countAndSay(n: Int): String = {
        //参数有效性的验证
        if(n <= 0){
            return ""
        }

        if(n == 1){
            return "1"
        }

        //n-1的模式串
        val s = countAndSay(n-1)
        var count =0
        var value = '0'
        val stringBuilder = new StringBuilder()
        for(i<- s){
            if(value == '0'||value == i){
                count += 1
            }else{
                stringBuilder.append(count).append(value)
                count = 1
            }
            value = i
        }
        stringBuilder.append(count).append(value)
        stringBuilder.toString()
    }
}
