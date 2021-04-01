fun testaFuncionarios() {
    var contaAlex = ContaCorrente("Alex", 100.9)
    var contaMaria = ContaPoupanca("Alex", 100.9)

    logicaMain(contaAlex, contaMaria)
    val andressa =Analista(
        nome = "Andressa",
        Cpf = "111.111.111.11",
        Salario = 1000.0
    )

    println("nome da gatinha é: ${andressa.nome}")
    println("CPF DA LENDA É: ${andressa.Cpf}")
    println("Ela recebe : ${andressa.Salario}")


    val franciele = Gerente(nome = "franciele", Cpf = "222.222.222.22", Salario = 3490.0, senha = 1234)
    println()
    println("nome da gatinha é: ${franciele.nome}")
    println("CPF DA LENDA É: ${franciele.Cpf}")
    println("Ela recebe : ${franciele.Salario}")
    println("Bonificacawn ${franciele.bonificacao}")
    if (franciele.autentica(senha = 1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Não vai nao amor")
    }

    val gui = Diretor(
        nome = "Gui",
        Cpf = "333.333.333-33",
        Salario = 12348.9,
        senha = 182293,
        plr = 3000.0
    )

    println()
    println("nome da gatinha é: ${gui.nome}")
    println("CPF DA LENDA É: ${gui.Cpf}")
    println("Ela recebe : ${gui.Salario}")
    println("Bonifica o gerente ${gui.bonificacao}")
    println("Passada recebeu participation nos lucros gay ${gui.bonificacao}")
    if (gui.autentica(senha = 182293)) {
        println("Autenticou com sucesso")
    } else {
        println("Não vai nao amor")
    }

    val maria = Analista(
        nome = "Maria",
        Cpf = "444.444.444.44",
        Salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gui)
    calculadora.registra(franciele)
    calculadora.registra(andressa)
    calculadora.registra(maria)
    println()
    println("total de bonificação: ${calculadora.total}")
}
