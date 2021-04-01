abstract class FuncionarioAdmin(
    nome: String,
    Cpf: String,
    Salario: Double,
    open val senha: Int
) : Funcionario(nome = nome, Cpf = Cpf, Salario = Salario) {


    open fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }


}