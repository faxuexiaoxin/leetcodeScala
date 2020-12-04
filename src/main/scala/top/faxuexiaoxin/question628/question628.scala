package top.faxuexiaoxin.question628

object question628 {
    def maximumProduct(nums: Array[Int]): Int = {
        val sortedNums = nums.sorted
        val length = nums.length
        val i = sortedNums(0) * sortedNums(1) * sortedNums(length-1)
        val j = sortedNums(length-1) * sortedNums(length -2 ) * sortedNums(length -3)
        return i max j
    }
}
