package SRP_CON
class Producto(val nombre: String, val precio: Double)
class CalcularDescuento(){
    fun Descuento( producto: Producto, porcentaje: Double): Double {
        return producto.precio - (producto.precio * porcentaje / 100)
}
}
class Imprimir(){
    fun imprimirDetalles(producto: Producto) {
        println("Producto: ${producto.nombre}, Precio: ${producto.precio} ")
}
}
fun main() {
    val producto = Producto("Laptop", 150000.0)
    val desc = CalcularDescuento()
    val imp = Imprimir()

    println("Precio con descuento ${desc.Descuento(Producto("Laptop", 150000.0), 10.0)}")
    desc.Descuento(producto ,10.0)
    imp.imprimirDetalles(producto)
}