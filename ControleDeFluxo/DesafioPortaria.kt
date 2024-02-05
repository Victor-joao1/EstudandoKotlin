package ControleDeFluxo

fun main() {

    portaria()
}

fun portaria() {

    println("Digite a sua idade: ")
    var idade = readLine()

    if (idade != null && idade != "")
        if (idade.toInt() < 18) {
            println("Negado, menores de idade não são permitidos!")
        }
    println("Digite o codigo do seu convite: ")
    var convite = readLine()
    convite = convite.toString().uppercase().substring(0, 2)

    if (convite == "XL" || convite == "XT") {
        if (convite == "XL") {
            println("Welcome cliente de luxo!") }
        else if (convite == "XT"){
            println("Welcome!") }
    }
    else {
        println("Convite inavalido!!!")
        }

    }

