package LSP

open class Figura
open class Calcular(var lado: Int) : Figura(){
    open fun calcularArea(): Int{
        return lado * lado
    }
}
class cuadrado : Calcular(5)
class rectangul : Figura()

fun main(){
    val calcular = Calcular(5)
    calcular.calcularArea()
    println("El area del cuadrado es: ${calcular.calcularArea()}")
}