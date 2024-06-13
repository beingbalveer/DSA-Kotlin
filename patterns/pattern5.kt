/**
 * 			Pattern 5
 * 			* * * * *
 * 			* * * *
 * 			* * *
 * 			* *
 *          *
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 1..n) {
        for(j in n downTo i) {
        	print("* ")
    	}
        println()
    }
}