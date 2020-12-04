package top.faxuexiaoxin.question36
import top.faxuexiaoxin.question36.question36.isValidSudoku
import org.junit.Test

class question36Test {
    @Test
    def testIsValidSudoku_condition1(): Unit ={
        val board = Array(
            Array('5','3','.','.','7','.','.','.','.'),
            Array('6','.','.','1','9','5','.','.','.'),
            Array('.','9','8','.','.','.','.','6','.'),
            Array('8','.','.','.','6','.','.','.','3'),
            Array('4','.','.','8','.','3','.','.','1'),
            Array('7','.','.','.','2','.','.','.','6'),
            Array('.','6','.','.','.','.','2','8','.'),
            Array('.','.','.','4','1','9','.','.','5'),
            Array('.','.','.','.','8','.','.','7','9')
        )

        val answer = isValidSudoku(board)
        val expect = true
        assert(expect == answer)
    }

    @Test
    def testIsValidSudoku_condition2(): Unit ={
        val board = Array(
            Array('8','3','.','.','7','.','.','.','.'),
            Array('6','.','.','1','9','5','.','.','.'),
            Array('.','9','8','.','.','.','.','6','.'),
            Array('8','.','.','.','6','.','.','.','3'),
            Array('4','.','.','8','.','3','.','.','1'),
            Array('7','.','.','.','2','.','.','.','6'),
            Array('.','6','.','.','.','.','2','8','.'),
            Array('.','.','.','4','1','9','.','.','5'),
            Array('.','.','.','.','8','.','.','7','9')
        )

        val answer = isValidSudoku(board)
        val expect = false
        assert(expect == answer)
    }
}
