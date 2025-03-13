/**
 * 	Pattern 18
 * E
 * DE
 * CDE
 * BCDE
 * ABCDE
 */

fun main() {
    numOfDigits1() 
}

fun numOfDigits1(n: Int): Int {
    return n.toString().length
}

fun printPattern2(n: Int) {
	return (log10(n.toDouble()) + 1).toInt()
}

fun numOfDigits3(n: Int): Int {
    var d = 1
    var times = n
    
    while(times > 10) {
       	times = times/10
        d++
    } 

    return d
}
