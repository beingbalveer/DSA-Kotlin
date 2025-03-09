/**
 * 	Pattern 12
 * 1      1
 * 12    21
 * 123  321
 * 12344321
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    
    for(i in 1..n) {
        for(j in 1..i) {
            print("$j")
        }
        
        for(j in 1..2*n - 2*i) {
            print(" ")
        }
        
        for(j in i downTo 1) {
            print("${j}")
        }
        print("\n")
    }
}