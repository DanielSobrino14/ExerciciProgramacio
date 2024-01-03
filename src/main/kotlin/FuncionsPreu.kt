import java.util.*

fun CalcularPreu(zones: Int, preuBase: Double): Double {
    return when (zones) {
        1 -> preuBase
        2 -> preuBase * 1.3125
        3 -> preuBase * 1.8443
        else -> 0.0
    }
}
fun BitlletSenzill() {
    val PreuBase = 2.40
    println("Has seleccionat comprar un Bitllet senzill.")
    val zones = numeroZones()
    val mostrarPreu = CalcularPreu(zones, PreuBase)
    comprarBitllet("BitlletSenzill", mostrarPreu)
}

fun TCasual() {
    println("Has seleccionat la tarjeta TCasual")
    val PreuBase= 11.35
    val zones= numeroZones()
    val mostrarPreu= CalcularPreu(zones, PreuBase)
    comprarBitllet("TCasual", mostrarPreu)
}

fun TUsual() {
    println("Has seleccionat la tarjeta TUsual")
    val PreuBase= 40.00
    val zones= numeroZones()
    val mostrarPreu= CalcularPreu(zones, PreuBase)
    comprarBitllet("TUsual", mostrarPreu)
}

fun TFamiliar() {
    println("Has seleccionat la tarjeta TFamiliar")
    val PreuBase= 10.00
    val zones= numeroZones()
    val mostrarPreu= CalcularPreu(zones, PreuBase)
    comprarBitllet("TFamilar", mostrarPreu)
}

fun TJove() {
    println("Has seleccionat la tarjeta TJove")
    val PreuBase= 80.00
    val zones= numeroZones()
    val mostrarPreu= CalcularPreu(zones, PreuBase)
    comprarBitllet("TJove", mostrarPreu)
}

fun comprarBitllet(Titol: String, preuFinal: Double) {
    println("El preu del teu $Titol és: $preuFinal €")

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
    println("Has completat la transacció. Aquest es el teu canvi: $canvi €")
    demanarTiquet()
}

fun demanarTiquet() {
    val respostaUsuari = llegirString("Vols el tiquet? (si/no): ", listOf("si", "no"))
    if (respostaUsuari == "si") {
        println("Estem imprimint el tiquet, esperi un moment")
    }
}