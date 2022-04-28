package caixaSupermercado

class Cliente{
    private var nomeCliente = ""
    private var idadeCliente = 0

    fun cadastrarCliente(){
        print("Digite o nome do cliente: ")
        nomeCliente = readln()

        print("Digite a idade do cliente: ")
        idadeCliente = readln().toInt()
    }

    fun verificaMaioridade(){
        if(idadeCliente >=18){
            println("----------------------------------------------------")
            println("Cliente $nomeCliente pode comprar bebidas alcoólicas\n")
        }
        else{
            println("--------------------------- A T E N Ç Ã O ---------------------------------")
            println("Cliente $nomeCliente é menor de idade e não pode comprar bebidas alcoólicas\n")
        }
    }
}
