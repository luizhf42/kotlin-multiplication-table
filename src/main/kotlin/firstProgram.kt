fun main() {
    println("- Multiplication Table System -")
    val number: Int = getNumberFromUser()
    printNumberMultiplicationTable(number)
}

fun getNumberFromUser(): Int {
    print("Enter a number: ")
    return readLine()!!.toInt()
}

fun printNumberMultiplicationTable(number: Int) {
    for (i in 0..10) {
        println("$number x $i: ${number * i}")
    }
}