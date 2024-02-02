package ControleDeFluxo

fun main() {
    bonus("Coordenador", 2)

}

/*
fun bonus(cargo: String) : Unit {
    if (cargo == "Gerente") {
        println("Parabéns você receberá 2.000,00 de bonificação")
    }
    if (cargo == "Coordenador") {
        println("Parabéns você receberá 1.500,00 de bonificação")
    }
    if (cargo == "Engenheiro de software") {
        println("Parabéns você receberá 1.000,00 de bonificação")
    }
    if (cargo == "Estagiario") {
        println("Parabéns você receberá 500,00 de bonificação")
     }
} */

fun bonus(cargo: String, experiencia: Int) : Unit {
    if (cargo == "Gerente") {
        if (experiencia <= 2) {
            println("Parabéns você receberá 2.000,00 de bonificação")
        } else {
            println("Parabéns você receberá 3.000,00 de bonificação")
        }
    }
    if (cargo == "Coordenador") {
        if (experiencia <= 1) {
            println("Parabéns você receberá 1.500,00 de bonificação")
        } else {
            println("Parabéns você receberá 1.800,00 de bonificação")
        }
    }
    if (cargo == "Engenheiro de software") {
        println("Parabéns você receberá 1.000,00 de bonificação")
    }
    if (cargo == "Estagiario") {
        println("Parabéns você receberá 500,00 de bonificação")
    }
}