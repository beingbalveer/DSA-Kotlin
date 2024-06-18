/**
 * 			Pattern 8
 * 1	* * * * * * * * *
 * 2	  * * * * * * *
 * 3		* * * * *
 * 4	      * * *
 * 5            *
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 1..n) {
        
        for(j in 1..i) {
        	print(" ")
    	}
        
        for(j in 1..2*(n-i)+1) {
        	print("*")
    	}
        
        for(j in 1..i) {
        	print(" ")
    	}
        
        println()
    }
}