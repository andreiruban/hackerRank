package io.ruban.practice.interview.strings

fun makeAnagram(a: String, b: String): Int {

    val rawA = a.filter { c -> b.contains(c) }
    val rawB = b.filter { c -> a.contains(c) }

    val charsA = charCount(rawA)
    val charsB = charCount(rawB)

    val commonChar = commonChars(charsA, charsB)
    val anagLength = commonChar.values.sum()

    return a.length - anagLength + b.length - anagLength
}

fun commonChars(a: Map<Char, Int>, b: Map<Char, Int>): Map<Char, Int> {
    val common = HashMap<Char, Int>()
    a.forEach { (c, count) ->
        if (count < b[c]!!) {
            common[c] = count
        } else common[c] = b[c]!!
    }
    return common
}

fun charCount(s: String): Map<Char, Int> {
    val chars = HashMap<Char, Int>()

    s.forEach { c ->
        when {
            chars.containsKey(c) -> {
                chars[c] = chars[c]!!.plus(1)
            }
            else -> {
                chars[c] = 1
            }
        }
    }

    return chars
}

fun main() {
    println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"))
}