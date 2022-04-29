package notasSimCity

import kotlin.system.exitProcess

class Menu {

    init{
        println("Deseja calcular a média de notas de um novo aluno?")
        println("[1] SIM")
        println("[2] NÃO")
        when(readln().toInt()){
            1 -> {
                val novoAluno = Aluno()
                novoAluno.cadastrarNome()
                novoAluno.cadastrarNotas()
                novoAluno.calcularMedia()
                Menu()
            }
            2 -> exitProcess(0)
            else -> {
                println("--------------------")
                println("Comando Inválido!")
                println("Digite 1 ou 2 apenas")
                println("--------------------")
                Menu()
            }
        }
    }

    companion object Mensagem{
        fun boasVindas(){
            println("Olá, prof!")
            println("Vamos calcular a média de notas")
            println("de um aluno da sua escolha :)")
        }
    }
}