package top.faxuexiaoxin.question2

object question2 {
    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
        //参数有效性验证
        if(l1 == null){
            return l2
        }
        if(l2 == null){
            return l1
        }

        //同时不为空的情况。
        var tmp1 = l1
        var tmp2 = l2
        val newList=new ListNode()
        var tmp = newList
        var firstData = 0
        var secondData = 0
        var sum = 0
        var signal = 0

        while(tmp1 != null || tmp2 != null){
            if(tmp1 != null){
                firstData = tmp1.x
            }else{
                firstData = 0
            }

            if(tmp2 != null){
                secondData = tmp2.x
            }else{
                secondData = 0
            }

            sum = firstData + secondData + signal
            signal = sum /10
            sum %=  10
            tmp.next = new ListNode(sum,null)
            tmp =tmp.next
            if(tmp1 !=null){
                tmp1 = tmp1.next
            }
            if(tmp2 !=null){
                tmp2 = tmp2.next
            }
        }

        //计算最终可能有进位的情况
        if(signal!=0){
            tmp.next = new ListNode(signal,null)
        }
        return newList.next
    }

    def main(args: Array[String]): Unit = {

    }
}
