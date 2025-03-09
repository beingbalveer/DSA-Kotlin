/**
 * 			Pattern 10
 * 1	*
 * 2	* * 
 * 3	* * * *
 * 4	* * * * *
 * 5    * * * * * *
 * 1	* * * * *
 * 2	* * * *
 * 3	* * *
 * 4	* *
 * 5    *
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 1..n) {
        
        for(j in 1..i) {
        	print("*")
    	}
        
        println()
    }
    
    for(i in 1..n - 1) {
        
        for(j in 1..n - i) {
        	print("*")
    	}
        
        println()
    }
   
}