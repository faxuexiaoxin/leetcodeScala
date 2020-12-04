package top.faxuexiaoxin.question35

import org.junit.Test
import org.junit.Assert._
import top.faxuexiaoxin.question35.question35._
class question35Test {
    @Test
    def testSearchInsert_condition1(): Unit ={
        val nums = Array(1,3,5,6)
        val target =5
        val answer = searchInsert(nums,target)
        val expect = 2
        assertEquals(expect,answer)
    }

    @Test
    def testSearchInsert_condition2(): Unit ={
        val nums = Array(1,3,5,6)
        val target =2
        val answer = searchInsert(nums,target)
        val expect = 1
        assertEquals(expect,answer)
    }

    @Test
    def testSearchInsert_condition3(): Unit ={
        val nums = Array(1,3,5,6)
        val target =7
        val answer = searchInsert(nums,target)
        val expect = 4
        assertEquals(expect,answer)
    }

    @Test
    def testSearchInsert_condition4(): Unit ={
        val nums = Array(1,3,5,6)
        val target =0
        val answer = searchInsert(nums,target)
        val expect = 0
        assertEquals(expect,answer)
    }



}
