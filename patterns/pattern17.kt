/**
 * 	Pattern 17
 *     A
 *    ABC
 *   ABCDC
 *  ABCDCBA
 * ABCDEDCBA
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 0..<n) {
        for(j in 0..n - i) {
            print(" ")
        }
        
        var c = 'A'
        for(j in 0..2*i) {
            if(j < i/2 + 2) {
                print(c)
                c = c + 1
            } else {
                print(c)
                c = c - 1
            }
        }
        
        
        print("\n")
    }
}