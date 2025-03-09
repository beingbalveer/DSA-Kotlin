/**
 * 			Pattern 9
 * * 1		    *
 * 2		  * * *
 * 3		* * * * *
 * 4	  * * * * * * *
 * 5    * * * * * * * * *
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
        
        for(j in 1..n-i) {
        	print(" ")
    	}
        
        for(j in 1..2*(i-1)+1) {
        	print("*")
    	}
        
        for(j in 1..n-i) {
        	print(" ")
    	}
        
        println()
    }
    
    for(i in 1..n) {
        
        for(j in 1..i-1) {
        	print(" ")
    	}
        
        for(j in 1..2*(n-i)+1) {
        	print("*")
    	}
        
        for(j in 1..i-1) {
        	print(" ")
    	}
        
        println()
    }
}