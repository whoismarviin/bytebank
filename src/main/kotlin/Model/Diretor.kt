package Model

import Autenticavel

open class Diretor(
    nome: String,
    Cpf: String,
    Salario: Double,
    senha : Int,
    val plr:Double
): FuncionarioAdmin(
    nome = nome,
    Cpf = Cpf,
    Salario = Salario,
    senha = senha
), Autenticavel {
    override val bonificacao: Double
        get() {
            return  Salario + plr
        }


    override fun autentica(senha: Int): Boolean {
        return this.senha == senha

    }
}