package Model

abstract class Conta(
    var titular: String,
    var saldo: Double

) {
    var numeroConta = 0

//     var saldo = 0.0
//        protected


    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double);

    fun transfere(destino: Conta, valor: Double): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }

        return false
    }


}