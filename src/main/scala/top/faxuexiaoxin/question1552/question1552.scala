package top.faxuexiaoxin.question1552

object question1552 {

    def maxDistance(position: Array[Int], m: Int): Int = {
        if(position ==null){return 0}
        //先对参数做保护性拷贝
        val newPosition = position.sortBy(x=>x)
        //判断参数有效性
        if(newPosition.isEmpty || newPosition(newPosition.length-1) < m || m < 2){
            return 0
        }
        //对数组进行排序

        //定义一些参数 ，总共有n个位置
        var left = 0
        var right = newPosition(newPosition.length-1)
        var answer = 0
        while(left <= right){
            var mid = (left + right) >> 1
            if(check(newPosition,mid,m)){
                answer = mid
                left = mid + 1
            }else{
                right = mid -1
            }
        }
        answer
    }

    private def check(position: Array[Int], mid: Int, m: Int): Boolean = {
        //private 方法不用检查有效性了
        var count = 1
        var current = position(0)
        for(i<- 1 until position.length if position(i) >= current + mid){
            current = position(i)
            count += 1
        }

        count >= m
    }

    def main(args: Array[String]): Unit = {
//        val array = Array(79,74,57,22)
//        val m = 4
//        val answer = maxDistance(array,m)
//        assert(answer==5)
//
//        val array1 = Array(5,4,3,2,1,1000000000)
//        val m1 = 2
//        val answer1 = maxDistance(array1,m1)
//        assert(answer1==999999999)

        val array2 = Array(44,91,24,99,31,20,32,71,89,49,37,23,54,62,16,68,21,97,53,52,5,45,85,87,56,78,25,86,63,72,34,36,30,77,12,98,48,61,60,3,26,84,13,70,27,88,64,29,93,38,73,46,90,94,43,4)
        val m2 = 37
        val answer2 = maxDistance(array2,m2)
        assert(answer2==1)
    }
}
