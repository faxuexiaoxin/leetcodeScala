package top.faxuexiaoxin.question40
import org.junit.Test
import org.junit.Assert._
import top.faxuexiaoxin.question40.question40.combinationSum2
class question40Test {
    @Test
    def testCombinationSum2_condition1(): Unit ={
        val array = Array(10,1,2,7,6,1,5)
        val target = 8
        val answer = combinationSum2(array,target)
        val expect = List(List(1,1,6),List(1,2,5),List(1,7),List(2,6))
        assert(expect sameElements answer)
    }
    @Test
    def testCombinationSum2_condition2(): Unit ={
        val array = Array(2,5,2,1,2)
        val target = 5
        val answer = combinationSum2(array,target)
        val expect = List(List(1,2,2),List(5))
        assert(expect sameElements answer)
    }


}
