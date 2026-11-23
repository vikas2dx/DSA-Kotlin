package linkedlist

class Node(var data: Int) {
    var next: Node? = null
}

class SinglyLinkedList {
    private var head: Node? = null

    // 1. Add a node at the end of the list - O(n)
    fun append(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }

        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = newNode
    }

    // 2. Add a node at the beginning of the list - O(1)
    fun prepend(data: Int) {
        val newNode = Node(data)
        newNode.next = head
        head = newNode
    }

    // 3. Delete the first node with the given value - O(n)
    fun delete(target: Int) {
        if (head == null) return

        // If the head itself holds the value to be deleted
        if (head?.data == target) {
            head = head?.next
            return
        }

        var current = head
        while (current?.next != null && current.next?.data != target) {
            current = current.next
        }

        // Bypass the target node if found
        if (current?.next != null) {
            current.next = current.next?.next
        }
    }

    // 4. Print the entire list - O(n)
    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println("null")
    }
}

