/**
 * 			Pattern 4
 * 			1
 * 			2 2
 * 			3 3 3
 * 			4 4 4 4
 *          5 5 5 5 5
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 1..n) {
        for(j in 1..i) {
        	print("$i ")
    	}
        println()
    }
}