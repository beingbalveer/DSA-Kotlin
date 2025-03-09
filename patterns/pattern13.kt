/**
 * 	Pattern 13
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 * 11 12 13 14 15 
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    var num = 1
    
    for(i in 1..n) {
        for(j in 1..i) {
            print("${num++} ")
        }
        
        print("\n")
    }
}