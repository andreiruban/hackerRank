package io.ruban.practice.interview.dictionaries

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val mMap = HashMap<String, Int>()
    val nMap = HashMap<String, Int>()
    magazine.forEach { w ->
        if (mMap.containsKey(w)) {
            mMap[w] = mMap[w]!! + 1
        } else mMap[w] = 1
    }
    note.forEach { n ->
        if (nMap.containsKey(n)) {
            nMap[n] = nMap[n]!! + 1
        } else nMap[n] = 1
    }

    nMap.forEach { (word, count) ->
        if (!(mMap.containsKey(word) && mMap[word]!! > count - 1)) {
            println("No")
            return
        }
    }

    println("Yes")
}

fun main() {
    checkMagazine(arrayOf("give", "me", "one", "grand", "today", "night"), arrayOf("give", "one", "grand", "today"))
    checkMagazine(arrayOf("two", "times", "three", "is", "not", "four"), arrayOf("two", "times", "two", "is", "four"))
}