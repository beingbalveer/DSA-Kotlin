/**
 * 	Pattern 11
 * 0 
 * 1 0 
 * 0 1 0 
 * 1 0 1 0 
 * 0 1 0 1 0 
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    
    for(i in 1..n) {
        for(j in 1..i) {
            print("${(j + i)%2} ")
        }
        print("\n")
    }
}