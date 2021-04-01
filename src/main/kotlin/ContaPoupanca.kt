class ContaPoupanca(titular: String, saldo: Double)
    :Conta(
    titular,
    saldo
) {

    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }

}