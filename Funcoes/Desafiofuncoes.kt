package Funcoes

import kotlin.math.min

fun main() {

    tempo(2)
    QuantidadeString("Banana")
    Cubo(3)
    ConversorDeDistancias(2.0f)
}

fun tempo(a: Int) {
    var meses: Int = (a * 12)
    var dias: Int = (a * 365)
    var horas: Int = (a * 365 * 24)
    var minutos: Int = (a * 365 * 24 * 60)
    var segundos: Int = (a * 365 * 24 * 60 * 60)

    println(
        "Os convertidos anos convertidos em \nMeses: $meses \nDias: $dias \nHoras: $horas " +
                "\nMinutos: $minutos \nSegundos: $segundos"
    )
}

fun QuantidadeString(palavra: String) {
    var text: Int = palavra.length
    return println("A quantidade de caractéres é $text")
}

fun Cubo(a: Int): Unit {

    var calculando: Int = a * a * a
    return println("O numero ao Cubo é $calculando")
}

fun ConversorDeDistancias(milhas: Float): Unit {

    var kilometros: Float = milhas * 1.6f
    return print("$milhas milhas convertidas em Km são $kilometros")

}