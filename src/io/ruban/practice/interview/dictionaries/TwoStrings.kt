package io.ruban.practice.interview.dictionaries

// Complete the twoStrings function below.
fun twoStrings(s1: String, s2: String): String = if (s1.any { c -> s2.contains(c) }) { "YES" } else "NO"

fun main() {
    println(twoStrings("hello", "world"))
    println(twoStrings("hi", "world"))
}