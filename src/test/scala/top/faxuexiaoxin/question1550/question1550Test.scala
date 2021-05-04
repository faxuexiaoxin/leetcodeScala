package top.faxuexiaoxin.question1550

import org.junit.Test
import question1550.threeConsecutiveOdds
class question1550Test {
    @Test
    def testThreeConsecutiveOdds_condition1(): Unit ={
        val array =Array(2,6,4,1)
        val answer = threeConsecutiveOdds(array)
        val expect = false
        assert(expect == answer)
    }

    @Test
    def testThreeConsecutiveOdds_condition2(): Unit ={
        val array =Array(1,2,34,3,4,5,7,23,12)
        val answer = threeConsecutiveOdds(array)
        val expect = true
        assert(expect == answer)
    }
}
