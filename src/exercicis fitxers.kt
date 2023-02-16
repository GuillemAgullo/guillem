import java.io.File

fun multiplicarTaules() {

    val numeros = listOf<Int>(1, 2, 3, 4, 5, 6, 8, 9, 10)

    val file = File("taules.txt").bufferedWriter()
    file.use {

        for (tabla in 1..10) {
            var string = "Tabla del: ${tabla}"
            for (i in numeros) {
                val operacio = tabla * i
                val string2 = "$tabla * $i = $operacio\n"
                it.write(string2)
            }
            it.newLine()
        }
    }
}

fun llegirTaules(): ArrayList<List<String>>{
    val listaResultante = arrayListOf<List<String>>()
    val file = File("taules.txt").bufferedReader()

    file.use {
        it.forEachLine {lines ->
            listaResultante.add(listOf(lines))
        }
    }

    return listaResultante
}


fun main() {




}