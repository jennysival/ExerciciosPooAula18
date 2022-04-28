package notasSimCity

class Aluno {
    private var nomeAluno = ""
    private val notasDoAluno = ArrayList<Nota>()

    fun cadastrarNome(){
        println("-------------------------------")
        print("Digite o nome do aluno: ")
        nomeAluno = readln()
        println("-------------------------------")
    }

    fun cadastrarNotas(){
        for(i in 1..4){
            val novaNota = Nota()

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

        val mediaAluno = somarNotas/4.0

        println("------ R E S U L T A D O ------")
        println("Aluno: $nomeAluno")
        println("Média: $mediaAluno")
        println("-------------------------------")
    }
}