package Execoes

fun main() {

    var str: String? = null

    str?.let {
        it.lowercase()
    }
}