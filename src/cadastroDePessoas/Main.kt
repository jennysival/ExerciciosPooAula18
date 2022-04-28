package cadastroDePessoas

import kotlin.system.exitProcess


////● Fazer um arquivo principal que instancie os objetos, criar dois
////objetos da classe Pessoa, um representando Albert Einstein (nascido
////em 14/3/1879)


//outro representando Isaac Newton (nascido em
////4/1/1643) mostre quais seriam as idades de Einstein e Newton caso
////estivessem vivos.


fun main() {

    println("Seja Bem-Vinde ao sistema de\nverificação de idades\n")
    menuLeitura()

}

fun menuLeitura(){
    val menu = Menu()

    when(menu.opcMenu){
        1 -> albert()
        2 -> isaac()
        3 -> exitProcess(0)
        else -> {
            println("Opção inválida. Tente novamente")
            menuLeitura()
        }
    }
}

fun albert(){
    val albertEinstein = Pessoa()
    albertEinstein.informarNome("Albert Einstein")
    albertEinstein.ajustaDataNascimento(14, 3, 1879)
    albertEinstein.informarIdade()
    println("----------------------------------")

    menuLeitura()

}

fun isaac(){
    val isaacNewton = Pessoa()
    isaacNewton.informarNome("Isaac Newton")
    isaacNewton.ajustaDataNascimento(4, 1, 1643)
    isaacNewton.informarIdade()
    println("----------------------------------")

    menuLeitura()
}