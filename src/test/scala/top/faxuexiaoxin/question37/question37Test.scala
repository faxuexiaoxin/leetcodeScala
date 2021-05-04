package top.faxuexiaoxin.question37

import org.junit.Test
import top.faxuexiaoxin.question37.question37.solveSudoku
import top.faxuexiaoxin.question36.question36.isValidSudoku
class question37Test {
    @Test
    def testSolveSudoku(): Unit ={
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

        solveSudoku(board)
        board.foreach(x => { x.foreach(print(_));
                           println()})
        val answer = isValidSudoku(board)
        assert(answer)
    }
}
