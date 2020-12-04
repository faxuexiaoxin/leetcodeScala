package top.faxuexiaoxin.question628

import org.junit.Assert._
import org.junit.Test
import top.faxuexiaoxin.question628.question628.maximumProduct
class question628Test {
    @Test
    def testMaximumProduct(): Unit ={
        val nums = Array(1,2,3)
        val answer = maximumProduct(nums)
        val expect = 6
        assertEquals(expect , answer)
    }
}
