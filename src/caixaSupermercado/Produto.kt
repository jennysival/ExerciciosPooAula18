package caixaSupermercado

class Produto {
    var nomeProduto = ""
    var valorProduto = 0.0
    var quantidadeProduto = 0.0
    var valorTotalProduto = 0.0

    fun exibirProduto() {
        println("Produto: $nomeProduto")
        println("Preço(un): R$$valorProduto")
        println("Quantidade: $quantidadeProduto")
        println("------------------------------")
    }
}