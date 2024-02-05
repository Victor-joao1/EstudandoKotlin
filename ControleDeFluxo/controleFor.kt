package ControleDeFluxo

fun main() {

    //Utilizar dois pontos para percorrer e "step" para pular
    for (i in 1..10 step 2) {
        println("$i")
    }


    // Lembrar que a primeira variavel do for precisa ser criado
    val str = "Kotlin é show!"
    for(char in str) {
        print("$char")
    }

    //"downto" para colocar na ordem decrescente
    for (j in 20 downTo 0) {
        println("j")
    }
}