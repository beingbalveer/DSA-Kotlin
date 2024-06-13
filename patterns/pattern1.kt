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
    for(i in 1..5) {
        for(i in 1..5) {
        	print("* ")
    	}
        println()
    }
}