import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var N: Int
    var r: Int
    var c: Int
    var sum1 = 0

    println("Enter Value:")
    N = scanner.nextInt()
    val a = Array(N) { IntArray(N) }

    for (r in 0 until N) {
        for (c in 0 until N) {
            print("Enter Value [$r][$c]:")
            a[r][c] = scanner.nextInt()
        }
    }

    for (r in 0 until N) {
        for (c in 0 until N) {
            print("${a[r][c]}")
            sum1 += a[r][c]
        }

        println()
    }
    println("sum1: $sum1")

    var M: Int
    var i: Int
    var j: Int
    var sum2 = 0

    print("Enter Value of N: ")
    M = scanner.nextInt()
    val b = Array(M) { IntArray(M) }

    for (i in 0 until M) {
        for (j in 0 until M) {
            print("Enter Value of [$i][$j]:")
            b[i][j] = scanner.nextInt()
        }
    }

    for (i in 0 until M) {
        for (j in 0 until M) {
            print("${b[i][j]}")
            sum2 += b[i][j]
        }
        println()
    }
    println("sum2: $sum2")

    val sum: Int
    sum = sum1 + sum2
    println("Total Sum: $sum")
}
