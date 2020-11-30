package top.faxuexiaoxin.question1

import org.junit.{Before, Test}
import top.faxuexiaoxin.question1.question1.twoSum

class question1Test {
    @Before
    def setup(): Unit ={
        println("------------下面开始测试------------")
    }


    @Test
    def testTwoSum(): Unit ={
        val nums = Array(2,7,11,15)
        val target = 9
        val expectArray = Array(0,1)
        val array = twoSum(nums,target)
        assert(expectArray sameElements array)
    }


}
