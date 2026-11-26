import linkedlist.SinglyLinkedList
import searching.SearchingProgram
import strings.StringsProgram

fun main() {

    val programs = SearchingProgram()

    val nums = intArrayOf(3, 9, 10, 27, 38, 43, 82)


    val stringsProgram = StringsProgram()

    val s = "vikassingh"

    println(stringsProgram.nonRepeatingLongSubStringChar(s))


    val list = SinglyLinkedList()

    list.append(10)
    list.append(20)
    list.append(30)
    list.prepend(5)

    print("Initial list: ")
    list.printList() // 5 -> 10 -> 20 -> 30 -> null

    list.delete(20)
    print("After deleting 20: ")
    list.printList() // 5 -> 10 -> 30 -> null


}
