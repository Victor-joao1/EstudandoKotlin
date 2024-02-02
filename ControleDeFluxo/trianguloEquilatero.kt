package ControleDeFluxo

fun main() {
    trianguloEquilatero()
}

fun trianguloEquilatero() {

    println("Informe o primeiro lado do triangulo: ")
    var valor1 = readLine()

    println("Informe o segundo lado do triangulo: ")
    var valor2 = readLine()

    println("Informe o terceiro lado do triangulo: ")
    var valor3 = readLine()

    if (valor1 != null && valor1 != ""
        && valor2 != null &&  valor2 != ""
        && valor3 != null && valor3 != "") {

        val x = valor1.toInt()
        val y = valor2.toInt()
        val z = valor3.toInt()

        if (x == y && y == z && x == z) {
            println("É um triangulo equilatero")
        } else {
            println("Esse trinagulo não tem lados iguais")
        }

    }


}