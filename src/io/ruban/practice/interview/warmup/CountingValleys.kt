package io.ruban.practice.interview.warmup

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    var seaLevel: Int = 0
    var valleyCount: Int = 0
    var isValley: Boolean = false

    s.forEach { step ->
        if (step == 'D') {
            if (seaLevel == 0) isValley = true
            seaLevel--
        } else seaLevel++
        if (isValley && seaLevel == 0) {
            valleyCount++
            isValley = false
        }
    }

    return valleyCount
}

fun main() {
    val pair1: Pair<Int, String> = Pair(8, "UDDDUDUU")

    val result = countingValleys(n = pair1.first, s = pair1.second)

    println(result)
}