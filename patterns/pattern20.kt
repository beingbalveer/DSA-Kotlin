/**
 * 	Pattern 18
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 */

fun main() {
    printPattern(5)
}

//TODO: there is better solution using less loops. use space if else logic
fun printPattern(n: Int) {
     
    for(i in 0..<n) {
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
    
    for(i in 0..<n - 1) {
        for(j in 1..<n - i) {
            print("*")
        }
        
        for(j in 0 until 2 *i + 2) {
            print(" ")
        }
        
         for(j in 1..<n - i) {
            print("*")
        }
        
        print("\n")
    }
  
}