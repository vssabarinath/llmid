class SinglyLinkedList<T> {
    var first: Node<T>? = null

    class Node<T>(val data: T, var next: Node<T>? = null)
}

class Solution1 {
    companion object {

        fun midpoint(list: SinglyLinkedList<Char>): SinglyLinkedList.Node<Char>? {
            var slowPointer = list.first
            var fastPointer = list.first

            while (fastPointer?.next != null && fastPointer.next?.next != null) {
                slowPointer = slowPointer?.next
                fastPointer = fastPointer.next?.next
            }

            return slowPointer
        }
    }
}
