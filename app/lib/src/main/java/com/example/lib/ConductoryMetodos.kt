package com.example.lib

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        // TODO
        saldo += cantidad
        println("Deposito realizado. Saldo actual: $saldo")
    }
        fun retirar(cantidad: Double) {
// TODO: verifica que haya saldo suficiente
            if (saldo >= cantidad) {
                saldo -= cantidad
                println("Retiro de $cantidad realizado")
            } else {
                println("Saldo insuficiente. Saldo actual: $saldo")
            }
        }

    fun mostrarSaldo() {
        println("Saldo actual de $titular: $saldo")
    }
}
fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.mostrarSaldo()
}