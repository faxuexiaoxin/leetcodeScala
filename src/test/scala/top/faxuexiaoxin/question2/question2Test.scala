package top.faxuexiaoxin.question2

import java.util.Comparator

import org.junit.Test
import org.junit.Assert.assertEquals
import top.faxuexiaoxin.question2.question2.addTwoNumbers
class question2Test {
    @Test
    def testAddTwoNumbers(): Unit ={
        val list1= new ListNode(2)
        list1.next = new ListNode(4)
        list1.next.next = new ListNode(3)

        val list2= new ListNode(5)
        list2.next = new ListNode(6)
        list2.next.next = new ListNode(4)

        val answer = addTwoNumbers(list1,list2)

        val expectAnswer= Array(7,0,8)
        var tmp = answer
        for (i<- 0 until expectAnswer.length){
            assertEquals(expectAnswer(i),tmp.x)
            tmp = tmp.next
        }
    }

}
