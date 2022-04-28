package notasSimCity

class Nota() {
    var notaAvulsa = 0.0
        set(value) {
            if(value in 0.0..10.0){
                field = value
            }
            else{
                notaInvalida()
            }
        }

    fun cadastrarNota(){
        notaAvulsa = readln().toDouble()
    }

    fun notaInvalida(){
        println("-------- Nota Inválida --------")
        println("     Notas aceitas: 0 a 10     ")
        println("-------------------------------")
        print("Digite novamente: ")
        cadastrarNota()
    }
}
