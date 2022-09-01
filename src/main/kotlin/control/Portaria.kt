package control

import business.ConviteBusiness

class Portaria {

    private val conviteBusiness = ConviteBusiness()
    init {
        println("Portaria iniciada.")
        println(this.controle())
    }
    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade? ")

        if (idade < 18) {
            return "Negado. Menores de idade não são permitidos."
        }

        val tipoConvite = Console.readString("Qual é o tipo do convite?")

        if(!conviteBusiness.tipoValido(tipoConvite)) {
            return "Negado. Convite inválido"
        }

        val codigo = Console.readString("Qual é o código do convite?")

        if(!conviteBusiness.codigoValido(codigo, tipoConvite)) {
            return "Negado. Código inválido"
        }

        println(tipoConvite)

        return "TODO!"

    }
}