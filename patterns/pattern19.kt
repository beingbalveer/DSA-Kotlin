/**
 * 	Pattern 18
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 0..<n) {
        for(j in 1..n - i) {
            print("*")
        }
        
        for(j in 0 until 2 *i) {
            print(" ")
        }
        
         for(j in 1..n - i) {
            print("*")
        }
        
        println("")
    }
    
    for(i in 0..n) {
        for(j in 0..i) {
            print("*")
        }
        
        for(j in 0 until 2 * n - 2 *i - 2) {
            print(" ")
        }
        
         for(j in 0..i) {
            print("*")
        }
        
        print("\n")
    }
}