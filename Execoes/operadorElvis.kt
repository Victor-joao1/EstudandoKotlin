package Execoes

fun main() {
    //Elvis não é ternário
    val str: String? = null
    println(str ?: "nulo")
}