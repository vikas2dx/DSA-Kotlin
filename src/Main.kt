import arrays.ArrayPrograms
import sorting.SortingProgram

fun main() {

    val programs = SortingProgram()

    val nums = intArrayOf(1, 2, -9, 1, 2)
    programs.bubbleSort(nums)
    println(nums.contentToString())
}
