package ISP.Con2

    interface Trabajador{
        fun trabajar()
    }
interface Administrador{
    fun administrar()
}
interface Auditoriador{
    fun auditar()
}
class Desarrollador: Trabajador{
    override fun trabajar() {
        println("Desarrollador software...")
    }
}
fun main(){
    val dev = Desarrollador()
    dev.trabajar()
}

