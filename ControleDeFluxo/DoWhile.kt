package ControleDeFluxo

//Enquanto não receber um valor, não para de rodar o while
fun main() {
    do {
        println("Qual o seu nome: ")
        val value = readLine()
    } while (value == "")
}