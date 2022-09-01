package business

import entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipoConvite: String): Boolean =
        (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")

    fun convidadoValido(convidado: Convidado) = when (convidado.tipo) {
        "comum" -> convidado.codigo.startsWith("xt")
        "premium", "luxo" -> convidado.codigo.startsWith("xl")
        else -> false
    }

    fun maiorDeIdade(idade: Int) =  idade >= 18

}