package top.faxuexiaoxin.question1476
//没有什么好说的！！！！
class SubrectangleQueries(_rectangle: Array[Array[Int]]) {
    def updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (i<- row1 to row2 ; j<- col1 to col2){
            _rectangle(i)(j) = newValue
        }
    }

    def getValue(row: Int, col: Int): Int = {
        _rectangle(row)(col)
    }
}

//其实可以提问的，如果class的构造器有参数，那么object对应的伴生类需不需要有构造器
