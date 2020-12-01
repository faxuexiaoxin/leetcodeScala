package top.faxuexiaoxin.question32

import org.junit.Test
import org.junit.Assert._
import top.faxuexiaoxin.question32.question32._
class question32Test {

    /**
     * 测试用栈的方法
     */
    @Test
    def testLongestValidParentheses_Stack_Condition1(): Unit ={
            val s = ")("
            val answer = longestValidParentheses(s)
            assertEquals(0,answer)
    }

    @Test
    def testLongestValidParentheses_Stack_Condition2(): Unit ={
        val s = ""
        val answer = longestValidParentheses(s)
        assertEquals(0,answer)
    }

    @Test
    def testLongestValidParentheses_Stack_Condition3(): Unit ={
        val s = ")()())"
        val answer = longestValidParentheses(s)
        assertEquals(4,answer)
    }
    @Test
    def testLongestValidParentheses_Stack_Condition4(): Unit ={
        val s = "(()"
        val answer = longestValidParentheses(s)
        assertEquals(2,answer)
    }

    /**
     * 测试用顺序逆序的方法
     */
    @Test
    def testLongestValidParentheses_leftAndRight_Condition1(): Unit ={
        val s = ")("
        val answer = longestValidParentheses_leftAndRight(s)
        assertEquals(0,answer)
    }

    @Test
    def testLongestValidParentheses_leftAndRight_Condition2(): Unit ={
        val s = ""
        val answer = longestValidParentheses_leftAndRight(s)
        assertEquals(0,answer)
    }

    @Test
    def testLongestValidParentheses_leftAndRight_Condition3(): Unit ={
        val s = ")()())"
        val answer = longestValidParentheses_leftAndRight(s)
        assertEquals(4,answer)
    }
    @Test
    def testLongestValidParentheses_leftAndRight_Condition4(): Unit ={
        val s = "(()"
        val answer = longestValidParentheses_leftAndRight(s)
        assertEquals(2,answer)
    }


}
