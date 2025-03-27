package OCP_con

open class Grafico { open fun dibujar() {
    println("Dibujando gráfico")
    }
}
class GraficoBarras : Grafico() {
    override fun dibujar() {
        println("Dibujando gráfica de barras")
    }
}
class GraficoLineas : Grafico() {
    override fun dibujar() {
        println("Dibujando gráfica de líneas")
    }
}
class Grafica {
    fun dibujar(grafico: Grafico) {
        grafico.dibujar()
    }
}
fun main() {
    val grafica = Grafica()

    val graficoBarras = GraficoBarras()
    val graficoLineas = GraficoLineas()

    grafica.dibujar(graficoBarras)
    grafica.dibujar(graficoLineas)
}


