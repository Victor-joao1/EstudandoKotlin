package ControleDeFluxo

fun main() {

    ladosIguais()



}

fun ladosIguais() {

    print("Informe o lado 1: ")
    var valor1 = readLine()

    print("Informe o lado 2: ")
    var valor2 = readLine()

    if (valor1 != null && valor1 != "" && valor2 != null && valor2 != "") {

        val x = valor1.toInt()
        val y = valor2.toInt()

        if (x == y) {

            println("Você tem um quadrado")

        } else {
            println("Não é um quadrado")
        }

    }
}
