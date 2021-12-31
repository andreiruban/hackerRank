package io.ruban.practice.linkedlist

import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

class DoublyLinkedListNode(nodeData: Int) {
    public var data: Int
    public var next: DoublyLinkedListNode?
    public var prev: DoublyLinkedListNode?

    init {
        data = nodeData
        next = null
        prev = null
    }
}

class DoublyLinkedList {
    public var head: DoublyLinkedListNode?
    public var tail: DoublyLinkedListNode?

    init {
        head = null
        tail = null
    }

    public fun insertNode(nodeData: Int) {
        var node = DoublyLinkedListNode(nodeData)

        if (head == null) {
            head = node
        } else {
            tail?.next = node
            node?.prev = tail
        }

        tail = node
    }
}

fun printDoublyLinkedList(head: DoublyLinkedListNode?, sep: String) {
    var node = head;

    while (node != null) {
        print(node?.data)
        node = node?.next

        if (node != null) {
            print(sep)
        }
    }
}

/*
 * Complete the 'sortedInsert' function below.
 *
 * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_DOUBLY_LINKED_LIST llist
 *  2. INTEGER data
 */

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     data: Int
 *     next: DoublyLinkedListNode
 *     prev: DoublyLinkedListNode
 * }
 *
 */

fun sortedInsert(llist: DoublyLinkedListNode?, data: Int): DoublyLinkedListNode? {
    var head = llist
    var cursor = llist
    var prev: DoublyLinkedListNode? = null
    while (cursor != null && cursor.data < data) {
        prev = cursor
        cursor = cursor.next
    }

    val node = DoublyLinkedListNode(data)

    if (prev == null) {
        head = node
    } else {
        prev.next = node
        node.prev = prev
    }

    if (cursor != null) {
        cursor.prev = node
        node.next = cursor
    }

    return head
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val llistCount = scan.nextLine().trim().toInt()
        val llist = DoublyLinkedList()

        for (i in 0 until llistCount) {
            val llist_item = scan.nextLine().trim().toInt()
            llist.insertNode(llist_item)
        }

        val data = scan.nextLine().trim().toInt()

        val llist1 = sortedInsert(llist?.head, data)

        printDoublyLinkedList(llist1, " ")
    }
}
