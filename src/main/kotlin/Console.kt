class Console private constructor() {

    companion object {

        fun readInt(msg: String): Int {
            var retorno: Int?

            do {

                print(msg)
                val info = readLine()

                retorno = info?.toIntOrNull()

                if (retorno == null || retorno <= 0) {
                    println("Valor inválido.")
                }

            } while (retorno == null || retorno <= 0)

            return retorno
        }

        fun readString(msg: String): String {
            var retorno: String?

            do {

                print(msg)
                retorno = readLine()


                if (retorno == null || retorno == "") {
                    println("Valor inválido.")
                }

            } while (retorno == null || retorno == "")

            return retorno.lowercase()
        }
    }
}