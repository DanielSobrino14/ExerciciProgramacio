import java.util.*

fun colorAzul() = "\u001B[34m"
fun colorRojo() = "\u001B[31m"
fun colorLila() = "\u001B[35m"



/**
 * Función principal que ejecuta la lógica de compra de billetes hasta un máximo de 3 intentos.
 * Muestra un menú de opciones y permite al usuario seleccionar el tipo de billete a comprar.
 */
fun main() {
    var bitllets = 0
    while (bitllets < 3) {
        MenuBitllets()
        val Bitllet = demanarOpcio()

        when (Bitllet) {
            1 -> BitlletSenzill()
            2 -> TCasual()
            3 -> TUsual()
            4 -> TFamiliar()
            5 -> TJove()
            0 -> println("Has finalitzat la compra. Gràcies per utilitzar aquesta màquina. Fins Aviat!!!")
            else -> println("Aquesta opció no és valida, torna a intentar-ho!!")
        }
        bitllets++
    }
    if (bitllets >= 3) {
        println("Has arribat al límit de transaccions possibles. Fins Aviat!!!")
    }
}

/**
 * Función para mostrar el menú de opciones disponibles de billetes.
 */
fun MenuBitllets() {
    println("\nBenvingut/da a la màquina de venda de bitllets del transport metropolità de Barcelona.")
    println("${colorAzul()}Selecciona el tipus de bitllet que desitges comprar:")
    println("1. Bitllet senzill")
    println("2. TCasual")
    println("3. TUsual")
    println("4. TFamiliar")
    println("5. TJove")
    println("0. Sortir")
}

/**
 * Función para solicitar al usuario que introduzca una opción válida del menú.
 * @return Opción seleccionada por el usuario.
 */
fun demanarOpcio(): Int {
    return llegirInt("Introdueix el número del bitllet que vols comprar: ", 0, 5)
}

/**
 * Función que solicita al usuario seleccionar el número de zonas para el billete.
 * @return Número de zonas seleccionadas.
 */
fun numeroZones(): Int {
    return llegirInt(
        "\nSelecciona les zones de distància que vols visitar:\n1. Zona 1\n2. Zona 2\n3. Zona 3\n Introdueix el número de zones: ",
        1,
        3
    )
}
