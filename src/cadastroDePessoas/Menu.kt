package cadastroDePessoas

class Menu {
    var opcMenu = 0

    init {
        println("--------- E S C O L H A ----------")
        println("[1] Albert Einstein")
        println("[2] Isaac Newton")
        println("[3] Sair")
        println("Digite a opção desejada:")
        opcMenu = readln().toInt()
    }
}