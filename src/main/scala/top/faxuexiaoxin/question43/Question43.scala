package top.faxuexiaoxin.question43


class Question43 {
    def multiply(num1: String, num2: String): String = {
        var result = "0"

        if("0".equals(num1) || "0".equals(num2)){
            return result
        }

        for(i <- Range(num2.size -1,-1,-1) ;j = num2.size -1 -i){
            val number = num2(i) - '0'
            val str = smallMultiply(num1, number) + "0"*j
            result = add(str,result)
        }
        result
    }

    def smallMultiply(num1:String,number:Int):String ={
        val string:StringBuffer = new StringBuffer()
        var jinwei = 0

        if(number == 0){
            return "0";
        }

        for(i<- Range(num1.length - 1,-1,-1)){
            val answer = (num1(i) - '0') * number + jinwei
            jinwei = answer / 10
            string.append(answer % 10)
        }

        if(jinwei != 0){
            string.append(jinwei)
        }

        string.reverse.toString
    }

    def add(num1:String,num2:String):String = {
        var jinwei = 0
        val string:StringBuffer = new StringBuffer();

        val maxSize =
            if(num1.size >num2.size){
                num1.size
            }else{
                num2.size
            }
        var i = num1.size -1
        var j = num2.size -1
        while(i>=0 || j>=0){
            var data1 = 0
            if(i>=0){
                data1 = num1(i) - '0'
                i -= 1
            }

            var data2 = 0
            if(j>=0){
                data2 = num2(j) - '0'
                j -= 1
            }

            val result = data1 + data2 + jinwei
            jinwei = result / 10
            string.append(result % 10)
        }

        if(jinwei > 0){
            string.append(jinwei)
        }

        string.reverse().toString
    }
}
