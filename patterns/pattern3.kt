/**
 * 			Pattern 1
 * 			1
 * 			1 2
 * 			1 2 3
 * 			1 2 3 4
 *          1 2 3 4 5
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 1..5) {
        for(i in 1..i) {
        	print("$i ")
    	}
        println()
    }
}