package ControleDeFluxo

fun main() {
    bonusWhen("Coordenador")
}

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}