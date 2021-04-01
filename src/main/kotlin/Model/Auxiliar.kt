package Model

open class Auxiliar(
     nome: String,
     Cpf: String,
     Salario: Double,
): Funcionario(
    nome = nome,
    Cpf = Cpf,
    Salario = Salario
) {
    override val bonificacao: Double
        get() = Salario * 0.5

}