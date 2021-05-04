package top.faxuexiaoxin.question41
import org.junit.{Ignore, Test}
import question41.firstMissingPositive
import org.junit.Assert._
class question41Test {
    @Test
    def testFirstMissingPositive_condition1(): Unit ={
        val array = Array(1,2,0)
        val answer= firstMissingPositive(array)
        val expect =3
        assertEquals(expect,answer)
    }

    @Test
    def testFirstMissingPositive_condition2(): Unit ={
        val array = Array(3,4,-1,1)
        val answer= firstMissingPositive(array)
        val expect =2
        assertEquals(expect,answer)
    }

    @Test
    def testFirstMissingPositive_condition3(): Unit ={
        val array = Array(7,8,9,11,12)
        val answer= firstMissingPositive(array)
        val expect =1
        assertEquals(expect,answer)
    }

    @Test
    def testFirstMissingPositive_condition4(): Unit ={
        val array = Array(1)
        val answer= firstMissingPositive(array)
        val expect =2
        assertEquals(expect,answer)
    }
}
