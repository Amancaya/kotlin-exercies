fun main() {
    println("Introduce un numero por teclado")
    val num: Int = readLine()?.toInt() ?: -1
    println(num)
}