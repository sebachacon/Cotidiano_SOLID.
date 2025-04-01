

interface Dispositivo {
    fun encender()
}

class Televisor : Dispositivo {
    override fun encender() { println("Encendiendo televisor...")
        }
}

class Radio {
    fun sintonizar() {
        println("Sintonizando radio...")
        }
}

fun main() {
    val televisor: Dispositivo = Televisor()
    televisor.encender()

    val radio = Radio()
    radio.sintonizar()
}