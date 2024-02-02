package Funcoes

fun main() {

    val str = "Programação Kotlin"

    println("Tamanho da String é ${str.length}")

    println("Posição (index) 0 da String ${str[0]}")

    println(str.startsWith("Pro"))

    println(str.endsWith("abc"))

    print(str.substring(2, 4))

    println(str.replace("Kotlin", "Kotlin é show!"))

    println(str.lowercase())
    println(str.uppercase())

    print("                           meu nome é ".trim())


}