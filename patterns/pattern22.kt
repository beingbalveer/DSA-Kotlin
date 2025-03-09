/**
 * 	Pattern 22
 * 4444444
 * 4333334
 * 4322234
 * 4321234
 * 4322234
 * 4333334
 * 4444444
 */

fun main() {
    printPattern(5)
}

fun min(a: Int, b: Int) = if(a < b) a else b

fun printPattern(n: Int) {
     
    for(i in 0..<2 * n -1 ) {
        for(j in 0..<2 * n - 1) {
        	val top = i
        	val left = j
        	val right = (2 * n - 2) - j
        	val bottom = (2 * n - 2) - i
        	
        	val p = n - min(min(top, bottom), min(left, right))
           	print("$p")
        }
        
        println("")
    }
}