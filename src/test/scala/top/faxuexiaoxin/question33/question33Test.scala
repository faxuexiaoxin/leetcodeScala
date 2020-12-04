package top.faxuexiaoxin.question33

import org.junit.Assert._
import org.junit.Test
import top.faxuexiaoxin.question33.question33.search
class question33Test {

    @Test
    def testSearch_condition1(): Unit ={
        val nums = Array(4,5,6,7,0,1,2)
        val target = 0
        val answer = search(nums,target)
        val expect = 4
        assertEquals(expect,answer)
    }

    @Test
    def testSearch_condition2(): Unit ={
        val nums = Array(4,5,6,7,0,1,2)
        val target = 3
        val answer = search(nums,target)
        val expect = -1
        assertEquals(expect,answer)
    }

    @Test
    def testSearch_condition3(): Unit ={
        val nums = Array(1)
        val target = 0
        val answer = search(nums,target)
        val expect = -1
        assertEquals(expect,answer)
    }

    @Test
    def testSearch_condition4(): Unit ={
        val nums = Array(3,1)
        val target = 1
        val answer = search(nums,target)
        val expect = 1
        assertEquals(expect,answer)
    }

}
