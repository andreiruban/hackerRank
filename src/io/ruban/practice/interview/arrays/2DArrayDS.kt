package io.ruban.practice.interview.arrays

// Complete the hourglassSum function below.
fun hourglassSum(arr: Array<Array<Int>>): Int {
    val pattern: Set<Pair<Int, Int>> = setOf(
            Pair(0, 0), Pair(0, 1), Pair(0, 2), Pair(1, 1), Pair(2, 0), Pair(2, 1), Pair(2, 2)
    )

    var maxSum = Int.MIN_VALUE
    var sum = 0

    (0 until 4).forEach { i ->
        (0 until 4).forEach { j ->
            pattern.forEach { p ->
                sum += arr[i + p.first][j + p.second]
            }
            if (sum > maxSum) maxSum = sum
            sum = 0
        }
    }

    return maxSum
}

fun main() {

    val arr1: Array<Array<Int>> = arrayOf(
            arrayOf(-9, -9, -9, 1, 1, 1).toList().toTypedArray(),
            arrayOf(0, -9, 0, 4, 3, 2).toList().toTypedArray(),
            arrayOf(-9, -9, -9, 1, 2, 3).toList().toTypedArray(),
            arrayOf(0, 0, 8, 6, 6, 0).toList().toTypedArray(),
            arrayOf(0, 0, 0, -2, 0, 0).toList().toTypedArray(),
            arrayOf(0, 0, 1, 2, 4, 0).toList().toTypedArray()
    ).toList().toTypedArray()


    val arr2: Array<Array<Int>> = arrayOf(
            arrayOf(0, -4, -6, 0, -7, -6).toList().toTypedArray(),
            arrayOf(-1, -2, -6, -8, -3, -1).toList().toTypedArray(),
            arrayOf(-8, -4, -2, -8, -8, -6).toList().toTypedArray(),
            arrayOf(-3, -1, -2, -5, -7, -4).toList().toTypedArray(),
            arrayOf(-3, -5, -3, -6, -6, -6).toList().toTypedArray(),
            arrayOf(-3, -6, 0, -8, -6, -7).toList().toTypedArray()
    ).toList().toTypedArray()

    println(hourglassSum(arr1))
    println(hourglassSum(arr2))
}
