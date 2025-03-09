/**
 * 	Pattern 18
 * E
 * DE
 * CDE
 * BCDE
 * ABCDE
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 0..<n) {
        for(j in 'E' - i until 'E' + 1) {
            print("${j}")
        }
        
        print("\n")
    }
}