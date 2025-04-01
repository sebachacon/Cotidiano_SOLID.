package ISP.Con1

interface Encendedor{
    fun encender()
    fun apagar()
}
interface Conector{
    fun conectarWifi()
}
interface Actualizar{
    fun actualizarFirmware()
}
class Lampara: Encendedor{
    override fun encender() {
        println("Encendiendo la lampara")
    }
    override fun apagar() {
        println("Apagando la lámpara")
    }
}

fun main() {

}
