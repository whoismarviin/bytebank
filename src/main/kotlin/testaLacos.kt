
fun testaLacos() {
    var i = 0

    while (i < 5) {
        //Variaveis
        val titular = "João Roberto $i"
        println("Bem Vindo ao Bytebank: ")
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0
        saldo = 1000.89

        verificaSalario(saldo)
        imprimeInformacoes(titular, numeroConta, saldo)
        i++
    }
}