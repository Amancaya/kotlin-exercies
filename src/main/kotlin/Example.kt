fun main() {
    println("Introduce un numero")
    val num: Int = readLine()?.toInt() ?: -1
    println(num)
}