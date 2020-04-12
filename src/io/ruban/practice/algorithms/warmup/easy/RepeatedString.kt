package io.ruban.practice.algorithms.warmup.easy

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
    val toRepeat: Long = n / s.length
    val tail: Int = (n - toRepeat * s.length).toInt()

    val aInFull = s.filter { c -> c == 'a' }.count()
    val aInTail = s.subSequence(0 until tail).filter { c -> c == 'a' }.count()

    return aInFull * toRepeat + aInTail
}

fun main() {
    val pair1: Pair<String, Long> = Pair(first = "aba", second = 10)
    val pair2: Pair<String, Long> = Pair(first = "a", second = 1_000_000_000_000)
    println(repeatedString(s = pair1.first, n = pair1.second))
    println(repeatedString(s = pair2.first, n = pair2.second))
}
