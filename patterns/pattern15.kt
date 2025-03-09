/**
 * 	Pattern 15
 * A B C D E 
 * A B C D 
 * A B C 
 * A B 
 * A 
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    
    for(i in 1..n) {
        for(j in 'A' until 'A' + n - i + 1) {
            print("${j} ")
        }
        
        print("\n")
    }
}