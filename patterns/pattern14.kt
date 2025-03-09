/**
 * 	Pattern 14
 * A 
 * A B 
 * A B C 
 * A B C D 
 * A B C D E 
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    
    for(i in 1..n) {
        for(j in 'A' until 'A' + i) {
            print("${j} ")
        }
        
        print("\n")
    }
}