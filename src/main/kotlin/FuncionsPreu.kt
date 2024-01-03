import java.util.*

/**
 * Función que calcula el precio del billete basado en la cantidad de zonas.
 * @param zones Número de zonas seleccionadas.
 * @param preuBase Precio base para el cálculo.
 * @return Precio calculado según la cantidad de zonas.
 */
fun CalcularPreu(zones: Int, preuBase: Double): Double {
    return when (zones) {
        1 -> preuBase
        2 -> preuBase * 1.3125
        3 -> preuBase * 1.8443
        else -> 0.0
    }
}

/**
 * Función para comprar un billete sencillo.
 */
fun BitlletSenzill() {
    val PreuBase = 2.40
    println("${colorAzul()}Has seleccionat comprar un Bitllet senzill.")
    val zones = numeroZones()
    val mostrarPreu = CalcularPreu(zones, PreuBase)
    comprarBitllet("BitlletSenzill", mostrarPreu)
}

/**
 * Función para comprar una tarjeta TCasual.
 */
fun TCasual() {
    println("${colorRojo()}Has seleccionat la tarjeta TCasual")
    val PreuBase = 11.35
    val zones = numeroZones()
    val mostrarPreu = CalcularPreu(zones, PreuBase)
    comprarBitllet("TCasual", mostrarPreu)
}

/**
 * Función para comprar una tarjeta TUsual.
 */
fun TUsual() {
    println("${colorAzul()}Has seleccionat la tarjeta TUsual")
    val PreuBase = 40.00
    val zones = numeroZones()
    val mostrarPreu = CalcularPreu(zones, PreuBase)
    comprarBitllet("TUsual", mostrarPreu)
}

/**
 * Función para comprar una tarjeta TFamiliar.
 */
fun TFamiliar() {
    println("${colorRojo()}Has seleccionat la tarjeta TFamiliar")
    val PreuBase = 10.00
    val zones = numeroZones()
    val mostrarPreu = CalcularPreu(zones, PreuBase)
    comprarBitllet("TFamilar", mostrarPreu)
}

/**
 * Función para comprar una tarjeta TJove.
 */
fun TJove() {
    println("${colorAzul()}Has seleccionat la tarjeta TJove")
    val PreuBase = 80.00
    val zones = numeroZones()
    val mostrarPreu = CalcularPreu(zones, PreuBase)
    comprarBitllet("TJove", mostrarPreu)
}

/**
 * Función para realizar la compra de un billete o tarjeta.
 * @param Titol Título del billete o tarjeta seleccionada.
 * @param preuFinal Precio final a pagar.
 */
fun comprarBitllet(Titol: String, preuFinal: Double) {
    println("${colorLila()}El preu del teu $Titol és: $preuFinal €")
    var pagament = 0.0
    val EfectiuPermes = listOf(0.05, 0.10, 0.20, 0.50, 1.00, 2.0, 5.0, 10.0, 20.0, 50.0)

    while (pagament < preuFinal) {
        println("Introduïu una moneda o bitllet (${EfectiuPermes.joinToString(", ")} €): ")
        val moneda = readln().toDouble()

        if (moneda !in EfectiuPermes) {
            println("ERROR: Introduïu una moneda o bitllet vàlid.")
            continue
        }
        pagament += moneda
    }
    val canvi = pagament - preuFinal
    println("${colorAzul()}Has completat la transacció. Aquest es el teu canvi: $canvi €")
    demanarTiquet()
}

/**
 * Función para solicitar si el usuario desea obtener un tiquet.
 */
fun demanarTiquet() {
    val respostaUsuari = llegirString("Vols el tiquet? (si/no): ", listOf("si", "no"))
    if (respostaUsuari == "si") {
        println("${colorRojo()}Estem imprimint el tiquet, esperi un moment")
    }
}
