import Model.Cliente
import Model.Diretor
import Model.Gerente
import Model.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        Cpf = "111.111.111.111",
        Salario = 1000.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Vinicius",
        Cpf = "111.111.111.111",
        Salario = 1000.0,
        senha = 1000,
        plr = 1000.90
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "666.666.666.66",
        senha = 1223
    )



    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 1000)
    sistema.entra(cliente,1999)
    println("${gerente.nome} autenticado com sucesso")
    println()
    println("${diretor.nome} autenticado com sucesso")
    println()
    println("${cliente.nome} autenticado com sucesso")

}