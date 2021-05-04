package top.faxuexiaoxin.question39
import org.junit.Test
import org.junit.Assert._
import top.faxuexiaoxin.question39.question39.combinationSum
class question39Test {
    @Test
    def testCombinationSum_condition1(): Unit ={
        val array = Array(2,3,6,7)
        val target = 7
        val answer = combinationSum(array,target)
        val expect =List(List(2,2,3),List(7))
        //sameElements 似乎只支持一个Set()中元素的顺序部一样，似乎set就不一样
        assert(expect sameElements answer)
    }

    @Test
    def testCombinationSum_condition2(): Unit ={
        val array = Array(2,3,5)
        val target = 8
        val answer = combinationSum(array,target)
        val expect =List(List(2,2,2,2),List(2,3,3),List(3,5))
        assert(expect sameElements answer)
    }

}
