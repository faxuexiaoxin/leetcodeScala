package top.faxuexiaoxin.question40

import org.junit.{Assert, Test}

class Question40Test {
    @Test
    def testCombinationSum2(): Unit ={
        var candidates = Array(10,1,2,7,6,1,5)
        var target = 8
        var expected = List(
            List(1,7),
            List(1,2,5),
            List(2,6),
            List(1,1,6)
        )

        val result = Question40.combinationSum2(candidates, target)
        result.foreach(
            x=> {
                x.foreach(println)
                println()
            }
        )
        Assert.assertEquals(expected.size,result.size)
        for(i<- expected){
            Assert.assertTrue(result.contains(i))
        }
    }
    @Test
    def testCombinationSum2Condition1(): Unit ={
        var candidates = Array(2,5,2,1,2)
        var target = 5
        var expected = List(
            List(5),
            List(1,2,2)
        )

        val result = Question40.combinationSum2(candidates, target)
        result.foreach(
            x=> {
                x.foreach(println)
                println()
            }
        )
        Assert.assertEquals(expected.size,result.size)
        for(i<- expected){
            Assert.assertTrue(result.contains(i))
        }
    }
}
