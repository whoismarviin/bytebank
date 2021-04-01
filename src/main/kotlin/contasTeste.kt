import Model.ContaCorrente
import Model.ContaPoupanca

fun contasTeste() {
    val contaCorrente = ContaCorrente(
        "alex",
        saldo = 10000.90
    )

    val contaPoupanca = ContaPoupanca(
        titular = "franciele",
        saldo = 102993.0
    )

    contaCorrente.deposita(2000.0);
    contaPoupanca.deposita(1000.90)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo);
    println()

    contaCorrente.saca(200.0)
    contaPoupanca.saca(100.0)


    println("O saldo do álex após o saque: ${contaCorrente.saldo}")
    println("O saldo da franciele após o saque: ${contaPoupanca.saldo}")
    contaCorrente.transfere(contaPoupanca, 299.9)
    println()
    println("o saldo álex após a transferencia: ${contaCorrente.saldo}")
    println("o saldo da fran após a transferencia: ${contaPoupanca.saldo}")
}