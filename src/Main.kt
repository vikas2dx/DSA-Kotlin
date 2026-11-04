import arrays.ArrayPrograms

fun main() {

    val arrayPrograms = ArrayPrograms()

    val nums = intArrayOf(1, 2, 9, 1, 2)
    val target = 3

    println(arrayPrograms.prefixSumSubArraySum(nums, target))
}
