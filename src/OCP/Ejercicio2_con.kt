package OCP_con

interface MetodoEnvio {
    fun enviar(archivo: String)
}

class EnvioFTP : MetodoEnvio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por FTP: $archivo")
    }
}

class EnvioHTTP : MetodoEnvio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por HTTP: $archivo")
    }
}

fun main() {
    val metodos: List<MetodoEnvio> = listOf(EnvioFTP(), EnvioHTTP())

    for (metodo in metodos) {
        metodo.enviar("documento.txt")
    }
}