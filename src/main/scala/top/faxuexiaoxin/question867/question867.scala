package top.faxuexiaoxin.question867

object question867 {
    def transpose(A: Array[Array[Int]]): Array[Array[Int]] = {
        val row = A.length
        val column = A(0).length
        val B = Array.ofDim[Int](column,row)
        for(i<-0 until row ; j <- 0 until column){
            B(j)(i) = A(i)(j)
        }
        return B
    }

    def main(args: Array[String]): Unit = {
        val A = Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))
        val B = transpose(A)
        B.foreach(
            x => {
            x.foreach(print(_))
                println()
        })

        println("----------------")

        val A1 = Array(Array(1,2,3),Array(4,5,6))
        val B1 = transpose(A1)
        B1.foreach(
            x => {
                x.foreach(print(_))
                println()
            })
    }

}
