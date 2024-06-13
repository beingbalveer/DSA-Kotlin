/**
 * 			Pattern 6
 * 			1 2 3 4 5
 * 			1 2 3 4
 * 			1 2 3
 * 			1 2
 *          1
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in n downTo 1) {
        for(j in 1..i) {
        	print("$j ")
    	}
        println()
    }
}