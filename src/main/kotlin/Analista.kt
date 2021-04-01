open class Analista(
     nome: String,
     Cpf: String,
     Salario: Double,
):Funcionario(
    nome = nome,
    Cpf = Cpf,
    Salario = Salario
) {
    override val bonificacao: Double
        get() {
            println("bonificação analista")
            return Salario * 0.1
        }


}