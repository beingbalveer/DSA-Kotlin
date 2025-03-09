/**
 * 	Pattern 21
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
     
    for(i in 1..n) {
        for(j in 1..n) {
            if(j == 1 || j == n || i == 1 || i == n) {
            	print("*")
            } else {
                print(" ")
            }
        }
        
        println("")
    }
}