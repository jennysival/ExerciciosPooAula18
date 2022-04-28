package cadastroDePessoas

import java.time.LocalDate

class Pessoa(
    private var diaNascimento: Int = 0,
    private var mesNascimento: Int = 0,
    private var anoNascimento: Int = 0,
    private var nomePessoa: String = ""
    ) {

    private var idade = 0

    init {
        println("----------------------------------")
        println("Veja os Dados da Pessoa Escolhida:")
    }

    fun informarIdade(){
        var diaAtual = LocalDate.now().dayOfMonth
        var mesAtual = LocalDate.now().monthValue
        var anoAtual = LocalDate.now().year

        var calculoIdade = 0

        if(mesAtual < mesNascimento){
            calculoIdade = (anoAtual-1)-anoNascimento
            idade = calculoIdade
        }
        else{
            calculoIdade = anoAtual-anoNascimento
            idade = calculoIdade
        }

        println("Idade no dia atual: $idade")
    }

    fun informarNome(nome: String){
        nomePessoa = nome
        println("Nome: $nomePessoa")
    }

    fun ajustaDataNascimento(dia: Int, mes: Int, ano: Int){
        diaNascimento = dia
        mesNascimento = mes
        anoNascimento = ano

    }
}