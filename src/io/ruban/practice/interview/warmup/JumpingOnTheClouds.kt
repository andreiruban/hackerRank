package io.ruban.practice.interview.warmup

fun jumpingOnClouds(c: Array<Int>): Int {
    var steps: Int = 0
    var nextId: Int = 0

    outer@ while (nextId < c.size - 1) {
        inner@ for (inc in 2 downTo 1) {
            if (nextId + inc < c.size && c[nextId + inc] == 0) {
                steps += 1
                nextId += inc
                break@inner
            }
        }
    }
    return steps
}

fun main(args: Array<String>) {
    val arr1 = intArrayOf(0, 0, 0, 1, 0, 0).toTypedArray()
    val arr2 = intArrayOf(0, 0, 1, 0, 0, 1, 0).toTypedArray()

    println(jumpingOnClouds(arr1))
    println(jumpingOnClouds(arr2))
}
