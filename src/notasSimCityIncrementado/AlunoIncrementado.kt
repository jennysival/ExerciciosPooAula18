package notasSimCityIncrementado

class AlunoIncrementado {
    var nomeAluno = ""
    private val notasDoAluno = ArrayList<NotaIncrementado>()
    var mediaAluno = 0.0

    fun cadastrarNome(){
        println("-------------------------------")
        print("Digite o nome do aluno: ")
        nomeAluno = readln().uppercase()
        println("-------------------------------")
    }

    fun cadastrarNotas(){
        for(i in 1..4){
            val novaNota = NotaIncrementado()

            print("Digite a ${i}ª nota de $nomeAluno: ")
            novaNota.cadastrarNota()
            notasDoAluno.add(novaNota)
        }
    }

    fun calcularMedia(){
        var somarNotas = 0.0

        for(i: Int in notasDoAluno.indices){
            somarNotas += notasDoAluno[i].notaAvulsa
        }

        mediaAluno = somarNotas/4.0

        println("-------------------------------")
        println("ALUNO: $nomeAluno")
        println("MÉDIA: $mediaAluno")
        println("-------------------------------")
    }
}