package CaixaSupermercado

import kotlin.system.exitProcess

class Caixa {

    val listaProdutos = ArrayList<Produto>()

    init {
        println("     SEJA BEM-VINDE AO SUPERMERCADO     ")
        val novoCliente: Cliente = Cliente()
        novoCliente.cadastrarCliente()
        novoCliente.verificaMaioridade()
        menu()
    }

    fun cadastrarProdutosNaLista(){
        println("---------- CADASTRAR PRODUTOS ----------")
        print("Quantos produtos deseja adicionar?")
        val qtdProdutos = readln().toInt()

        for(i in 1..qtdProdutos){
            val novoProduto = Produto()

            print("Digite o ${i}º produto: ")
            novoProduto.nomeProduto = readln()

            print("Digite o preço de ${novoProduto.nomeProduto} (Ex: 25.5): ")
            novoProduto.valorProduto = readln().toDouble()

            print("Digite a quantidade de ${novoProduto.nomeProduto} (Ex: 2): ")
            novoProduto.quantidadeProduto = readln().toDouble()

            novoProduto.valorTotalProduto = novoProduto.valorProduto * novoProduto.quantidadeProduto

            listaProdutos.add(novoProduto)
        }

        menu()
    }

    fun exibirListaProdutosCadastrados(){
        println("------- EXIBIR LISTA DE PRODUTOS -------")
        listaProdutos.forEach {
            it.exibirProduto()
        }

        menu()
    }

    fun calcularValorTotalProdutosDaLista(){
        println("-------- VALOR TOTAL DA COMPRA ---------")

        var soma = 0.0
        for(i: Int in listaProdutos.indices){
            soma += listaProdutos[i].valorTotalProduto
        }

        println("R$$soma")

        menu()
    }

    fun menu(){
        println("--------------- M E N U ----------------")
        println("[1] Cadastrar Produtos")
        println("[2] Exibir Produtos Cadastrados")
        println("[3] Calcular Valor da Compra")
        println("[4] Sair")
        println("------- Digite a Opção Desejada --------")
        val opcMenu = readln().toInt()

        when(opcMenu){
            1 -> cadastrarProdutosNaLista()
            2 -> exibirListaProdutosCadastrados()
            3 -> calcularValorTotalProdutosDaLista()
            4 -> exitProcess(0)
            else -> {
                println("\n     Opção Inválida. Tente Novamente    \n")
                menu()
            }
        }
    }
}