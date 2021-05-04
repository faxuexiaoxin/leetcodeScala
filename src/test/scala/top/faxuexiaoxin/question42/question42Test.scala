package top.faxuexiaoxin.question42
import org.junit.Assert._
import org.junit.Test
import question42.trap
class question42Test {
    @Test
    def testTrap_condition1(): Unit ={
        val height = Array(0,1,0,2,1,0,1,3,2,1,2,1)
        val answer = trap(height)
        val expect = 6
        assertEquals(expect,answer)
    }

    @Test
    def testTrap_condition12(): Unit ={
        val height = Array(4,2,0,3,2,5)
        val answer = trap(height)
        val expect = 9
        assertEquals(expect,answer)
    }
}
