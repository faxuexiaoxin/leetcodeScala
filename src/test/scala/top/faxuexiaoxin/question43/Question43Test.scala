package top.faxuexiaoxin.question43

import org.junit.{Assert, Test}

class Question43Test {
    @Test
    def testAdd(): Unit ={
        val num1 = "223"
        val num2 = "998"
        val result = new Question43().add(num1,num2)
        Assert.assertEquals("1221",result)
    }

    @Test
    def testSmallMultiply(): Unit ={
        val num1 = "223"
        val number = 4
        val result = new Question43().smallMultiply(num1,number)
        Assert.assertEquals("892",result)
    }

    @Test
    def testMultiply(): Unit ={
        val num1 = "2"
        val num2 = "3"
        val expect = "6"
        val result = new Question43().multiply(num1,num2)
        Assert.assertEquals(expect,result)
    }

    @Test
    def testMultiplyCondition1(): Unit ={
        val num1 = "123"
        val num2 = "456"
        val expect = "56088"
        val result = new Question43().multiply(num1,num2)
        Assert.assertEquals(expect,result)
    }

    @Test
    def testMultiplyCondition2(): Unit ={
        val num1 = "0"
        val num2 = "52"
        val expect = "0"
        val result = new Question43().multiply(num1,num2)
        Assert.assertEquals(expect,result)
    }

}
