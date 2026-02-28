package com.example.lib

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido() {
        println("Sonido genérico.")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("Guau Guau")
    }
}
// TODO: Crea Gato y Vaca de forma similar
class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("Muu Muu")
    }
}
class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("Miau Miau")
    }
}
fun main() {
    val perro = Perro("Rex", 3)
    perro.describirse()
    perro.hacerSonido()

// TODO: Crea y usa Gato y Vaca

    val vaca = Vaca("Zeus", 10)
    vaca.describirse()
    vaca.hacerSonido()

    val gato = Gato("Patroclo", 5)
    gato.describirse()
    gato.hacerSonido()
}