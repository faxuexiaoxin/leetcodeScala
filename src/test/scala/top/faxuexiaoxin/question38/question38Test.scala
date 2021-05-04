package top.faxuexiaoxin.question38

import org.junit.Test
import org.junit.Assert._
import top.faxuexiaoxin.question38.question38.countAndSay
class question38Test {
    @Test
    def testCountAndSay_condition1(): Unit ={
        val n = 1
        val answer = countAndSay(n)
        val expect = "1"
        assertEquals(expect,answer)
    }

    @Test
    def testCountAndSay_condition2(): Unit ={
        val n = 4
        val answer = countAndSay(n)
        val expect = "1211"
        assertEquals(expect,answer)
    }
}
