package io.ruban.practice.interview.arrays

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val shifts = d % a.size
    return a.slice(shifts until a.size).plus(a.slice(0 until shifts)).toTypedArray()
}

fun main() {
    val result1: Array<Int> = rotLeft(intArrayOf(1, 2, 3, 4, 5).toTypedArray(), 1)
    println(result1.joinToString(" "))
}