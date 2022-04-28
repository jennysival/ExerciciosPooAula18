package cadastroDePessoas
//● Observações: lembrar de usar o conceito de encapsulamento, além
//disso seu programa pode coletar os dados do usuário ou usar valores
//estáticos, além disso faça uso dos conceitos vistos em sala de aula e
//use a criatividade.
//● Sugestão: você pode criar um menu para seu programa ser mais
//amigável(isso é opcional, e caso faça use a criatividade)

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
        var diaAtual = 28
        var mesAtual = 4
        var anoAtual = 2022

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