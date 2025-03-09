/**
 * 	Pattern 16
 * A 
 * B B 
 * C C C 
 * D D D D 
 * E E E E E 
 */

fun main() {
    printPattern(5)
}

fun printPattern(n: Int) {
    for(i in 0..<n) {
        var c = 'A' + i
        for(j in 0..i) {
            print("${c} ")
        }
        print("\n")
    }
}