package Funcoes

fun main() {

    HelloWorld()

    println("A soma de dois valores é ${soma(2,2)}")

}
fun soma(a: Int, b: Int): Int {
    return (a + b)
}
// Unit para funções sem retorono
// É necessário dizer o tipo do parametro e do retorno tbm
fun HelloWorld(): Unit {
    println("HelloWorld")
}