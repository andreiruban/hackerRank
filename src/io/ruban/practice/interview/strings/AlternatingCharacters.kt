package io.ruban.practice.interview.strings

// Complete the alternatingCharacters function below.
fun alternatingCharacters(s: String): Int = s.filterIndexed { id, c -> id > 0 && c == s[id - 1] }.length

fun main() {
    println(alternatingCharacters("AAAA"))
    println(alternatingCharacters("BBBBB"))
    println(alternatingCharacters("ABABABAB"))
    println(alternatingCharacters("BABABA"))
    println(alternatingCharacters("AAABBB"))
}