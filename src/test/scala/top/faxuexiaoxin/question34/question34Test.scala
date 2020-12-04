package top.faxuexiaoxin.question34

import org.junit.Test
import org.junit.Assert._
import top.faxuexiaoxin.question34.question34.searchRange

class question34Test {
    @Test
    def testSearchRange_condition1(): Unit ={
        val nums = Array(5,7,7,8,8,10)
        val target = 8
        val answer =searchRange(nums,target)
        val expect = Array(3,4)
        assertArrayEquals(expect,answer)
    }

    @Test
    def testSearchRange_condition2(): Unit ={
        val nums = Array(5,7,7,8,8,10)
        val target = 6
        val answer =searchRange(nums,target)
        val expect = Array(-1,-1)
        assertArrayEquals(expect,answer)
    }

    @Test
    def testSearchRange_condition3(): Unit ={
        val nums = Array[Int]()
        val target = 0
        val answer =searchRange(nums,target)
        val expect = Array(-1,-1)
        assertArrayEquals(expect,answer)
    }

    @Test
    def testSearchRange_condition4(): Unit ={
        val nums = Array(2,2)
        val target = 3
        val answer =searchRange(nums,target)
        val expect = Array(-1,-1)
        assertArrayEquals(expect,answer)
    }
}
