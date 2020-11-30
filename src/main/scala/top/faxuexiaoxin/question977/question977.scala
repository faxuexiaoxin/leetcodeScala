package top.faxuexiaoxin.question977

object question977 {
    def sortedSquares(A: Array[Int]): Array[Int] = {
        if(A==null || A.isEmpty){return A}

        val array = A.map(math.pow(_,2).toInt).sorted

        array
    }

    def sortedSquares1(A: Array[Int]): Array[Int] = {
        if(A==null || A.isEmpty){return A}
        var i = 0
        var j = A.length - 1
        val array = new Array[Int](A.length)
        var arrayIndex= array.length -1
        while(i<=j){
            //不是很建议用答案的A(j) * A(j)和A(i) * A(i)来比较大小，因为已经计算过一次了。还不如先保存起来，在比较
            if(math.abs(A(i))<math.abs(A(j))){
                array(arrayIndex) = A(j) * A(j)
                j -= 1
            }else{
                array(arrayIndex) = A(i) * A(i)
                i += 1
            }
            arrayIndex -=1
        }
        return array
    }

    def main(args: Array[String]): Unit = {
        val A = Array(-4,-1,0,3,10)
        val answer = sortedSquares1(A)
        answer.foreach(println(_))
    }
}
