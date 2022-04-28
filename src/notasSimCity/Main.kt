package notasSimCity

import notasSimCity.Menu.Mensagem.boasVindas

fun main() {
    boasVindas()
    inicializar()
}

fun inicializar(){
    val primeiroAluno = Aluno()

    primeiroAluno.cadastrarNome()
    primeiroAluno.cadastrarNotas()
    primeiroAluno.calcularMedia()

    val primeiroMenu = Menu()
}