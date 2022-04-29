package notasSimCityIncrementado
import kotlin.system.exitProcess

class MenuIncrementado {
    val salaDeAula = SalaDeAulaIncrementado()

    fun iniciarSistema(){
        salaDeAula.cadastrarAluno()
        menuSimNao()
    }

    fun menuSimNao(){
        println("Deseja calcular a média\nde notas de um novo aluno?")
        println("[1] SIM")
        println("[2] NÃO")
        when(readln().toInt()){
            1 -> {
                salaDeAula.cadastrarAluno()
                menuSimNao()
            }
            2 -> menu2()
            else -> {
                println("-------------------------------")
                println("       Comando Inválido!       ")
                println("      Digite 1 ou 2 apenas      ")
                println("-------------------------------")
                menuSimNao()
            }
        }
    }

    fun menu2(){
        println("O que deseja fazer agora?")
        println("[1] Visualizar todos os alunos da turma")
        println("[2] Visualizar média de um único aluno")
        println("[3] Verificar média da turma")
        println("[4] Voltar")
        println("[5] Sair")
        when(readln().toInt()){
            1 -> {
                salaDeAula.exibirListaDeAlunos()
                menu2()
            }
            2 -> {
                salaDeAula.exibirUmAluno()
                menu2()
            }
            3 -> {
                salaDeAula.mediaDaTurma()
                menu2()
            }
            4 -> menuSimNao()
            5 -> exitProcess(0)
            else -> {
                println("-------------------------------")
                println("       Comando Inválido!       ")
                println("    Digite 1, 2, 3, 4 ou 5     ")
                println("-------------------------------")
                menu2()
            }
        }

    }


}