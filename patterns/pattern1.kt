/**
 * 			Pattern 1
 * 			* * * *
 * 			* * * *
 * 			* * * *
 * 			* * * *
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 1..n) {
        for(j in 1..n) {
        	print("* ")
    	}
        println()
    }
}