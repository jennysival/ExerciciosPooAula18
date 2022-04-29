package notasSimCityIncrementado

class SalaDeAulaIncrementado {
    private val listaDeAlunos = ArrayList<AlunoIncrementado>()

    fun cadastrarAluno(){
        val novoAluno = AlunoIncrementado()
        novoAluno.cadastrarNome()
        novoAluno.cadastrarNotas()
        novoAluno.calcularMedia()
        listaDeAlunos.add(novoAluno)
    }

    fun exibirListaDeAlunos(){
        listaDeAlunos.forEach { aluno ->
            aluno.calcularMedia()
        }
    }

    fun exibirUmAluno(){

        println("Digite o nome do aluno que deseja visualizar a média:")
        val nomeDigitado = readln().uppercase()

        for(i: Int in listaDeAlunos.indices){
            when(nomeDigitado){
                listaDeAlunos[i].nomeAluno -> {
                    listaDeAlunos[i].calcularMedia()
                }
            }
        }
    }

    fun mediaDaTurma(){
        var somaNotas = 0.0
        for(i: Int in listaDeAlunos.indices){
            somaNotas += listaDeAlunos[i].mediaAluno
        }

        val mediaTurma = somaNotas/listaDeAlunos.size

        println("----------------------------------")
        println("A média de notas da Turma foi: $mediaTurma")
        println("----------------------------------")
    }


}