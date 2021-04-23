package top.faxuexiaoxin.question44

import org.junit.{Assert, Before, Test}
class Question44Test {

    var question44:Question44 = null;

    @Before
    def setup(): Unit ={
        question44 = new Question44()
    }

    @Test
    def testIsMatch(): Unit ={
        val s = "aa"
        val p = "a"
        val expect = false
        val bool = question44.isMatch(s, p)
        Assert.assertEquals(expect,bool)
    }
    @Test
    def testIsMatchCondition1(): Unit ={
        val s = "aa"
        val p = "*"
        val expect = true
        val bool = question44.isMatch(s, p)
        Assert.assertEquals(expect,bool)
    }
    @Test
    def testIsMatchCondition2(): Unit ={
        val s = "cb"
        val p = "?a"
        val expect = false
        val bool = question44.isMatch(s, p)
        Assert.assertEquals(expect,bool)
    }
    @Test
    def testIsMatchCondition3(): Unit ={
        val s = "adceb"
        val p = "*a*b"
        val expect = true
        val bool = question44.isMatch(s, p)
        Assert.assertEquals(expect,bool)
    }
    @Test
    def testIsMatchCondition4(): Unit ={
        val s = "acdcb"
        val p = "a?c*b"
        val expect = false
        val bool = question44.isMatch(s, p)
        Assert.assertEquals(expect,bool)
    }
    @Test
    def testIsMatchCondition5(): Unit ={
        val s = "aa"
        val p = "a"
        val expect = false
        val bool = question44.isMatch(s, p)
        Assert.assertEquals(expect,bool)
    }
    @Test
    def testIsMatchCondition6(): Unit ={
        val s = "aa"
        val p = "a"
        val expect = false
        val bool = question44.isMatch(s, p)
        Assert.assertEquals(expect,bool)
    }
    @Test
    def testIsMatchCondition7(): Unit ={
        val s = "aa"
        val p = "a"
        val expect = false
        val bool = question44.isMatch(s, p)
        Assert.assertEquals(expect,bool)
    }
}
