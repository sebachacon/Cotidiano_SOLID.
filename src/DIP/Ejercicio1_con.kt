package DIP.con

interface IMensajeService {
    fun enviarMensaje(mensaje: String)
}

class EmailService : IMensajeService {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando correo: $mensaje")
    }
}

class SMSService : IMensajeService {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando SMS: $mensaje")
    }
}

class Notificador(private val servicio: IMensajeService) {
    fun notificar(mensaje: String) {
        servicio.enviarMensaje(mensaje)
    }
}

fun main() {

    val notificadorEmail = Notificador(EmailService())
    notificadorEmail.notificar("Hola Mundo por Email!")

    val notificadorSMS = Notificador(SMSService())
    notificadorSMS.notificar("Hola Mundo por SMS!")
}