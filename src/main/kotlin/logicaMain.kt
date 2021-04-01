fun logicaMain(contaAlex: Conta, contaMaria: Conta) {
    contaAlex.numeroConta = 11223

    contaMaria.deposita(40.0)
    contaAlex.deposita(67.90)
    contaAlex.numeroConta

    verificaSalario(contaAlex.saldo);
    imprimeInformacoes(contaAlex.titular, contaAlex.numeroConta, contaAlex.saldo)
}