open class Gerente(
     nome: String,
     Cpf: String,
     Salario: Double,
     senha : Int
):FuncionarioAdmin(
    nome = nome,
    Cpf = Cpf,
    Salario = Salario,
    senha = senha
),Autenticavel {
    override val bonificacao: Double
        get() {
            return Salario * 0.5
        }


    override fun autentica(senha: Int): Boolean {
        return this.senha == senha

    }
}