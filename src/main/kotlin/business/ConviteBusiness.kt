package business

class ConviteBusiness {
    fun tipoValido(tipoConvite: String): Boolean =
        (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo")

    fun codigoValido(codigo: String, tipoConvite: String): Boolean {
        return if (tipoConvite == "comum" && codigo.startsWith("xt")) {
            true
        } else (tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
    }

}