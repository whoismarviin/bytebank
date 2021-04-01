fun verificaSalario(saldo: Double) {
    when {
        saldo > 0.0 -> println("O seu saldo é positvo")
        saldo == 0.0 -> println("O seu saldo é nulo")
        else -> println("O seu saldo é negativo")
    }
}