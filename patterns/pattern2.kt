/**
 * 			Pattern 2
 * 			*
 * 			* *
 * 			* * *
 * 			* * * *
 */

fun main() {
    printPattern(4)
}

fun printPattern(n: Int) {
    for(i in 1..5) {
        for(j in 1..i) {
        	print("* ")
    	}
        println()
    }
}