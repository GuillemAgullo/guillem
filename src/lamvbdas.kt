import kotlin.math.*

fun main(){

    // EXERCICI 1
    //print(dialectalOf("hola ernesto", Dialect.A))

    // EXERCICI 2
    //print(productOfPairs(listOf(1,2,3,4)))

    // EXERCICI 3
    //print(powers(listOf(1,null,3,4)))

    // EXERCICI 4
    //print(equals(listOf(1,2,3,4), listOf(1,2,3,4)))

    // EXERCICI 5
    //print(similar(listOf(1,3,2,3,4,4,5), listOf(1,2,3,4)))

    // EXERCICI 6
    //print(sumLists(listOf(1,2,3,4), listOf(1,2,3,4)))

    // EXERCICI 7
    //print(findInsert(listOf(1,2,3,4), 8))

    // EXERCICI 8
    //print(anonymousMathOperation(6, 8) { a, b -> (a + b).toDouble() }) // SUMA
    //print(anonymousMathOperation(6, 8) { a, b -> (a.toDouble() / b.toDouble()) }) // DIVISIÓ
    //print(anonymousMathOperation(6, 8) { a, b -> (a.toDouble() * b.toDouble()) }) // MULTIPLICACIÓ

}

// EXERCICI 1
enum class Dialect(val vocal: Char){

    A('a'),E('e'),I('I'),O('o'),u('u')

}

// EXERCICI 1A
fun dialectalEOf(sentence: List<Char>): List<Char> {

    val vocalsList = listOf('a', 'e', 'i', 'o', 'u')
    val sentenceWithE = sentence.map {
        if (it in vocalsList) {
            'e'
        }else {
            it
        }
    }
    return sentenceWithE

}

// EXERCICI 1B
fun dialectalOf(sentence: String, dialect: Dialect): String {

    val vocalsList = listOf('a', 'e', 'i', 'o', 'u')
    val sentenceWithE = sentence.map {
        if (it in vocalsList) {
            dialect.vocal
        }else {
            it
        }
    }
    return String(sentenceWithE.toCharArray())

}

// EXERCICI 2
fun productOfPairs(list: List<Int>): Double{

    return list.filter{ it % 2 == 0 }.reduce{ accomulator, elem -> accomulator * elem }.toDouble()

}

// EXERCICI 3
fun powers(list: List<Int?>): List<Int>{

    return list.filterNotNull().mapIndexed{ index, it -> (it.toDouble().pow(index)).toInt()}

}

// EXERCICI 4
fun equals(l1: List<Int>, l2: List<Int>): Boolean{

    return l1.zip(l2) { e1, e2 ->
        e1 == e2
    }.all{ it }

}

// EXERCICI 5
fun similar(l1: List<Int>, l2: List<Int>): Boolean{

    return l1.all{ l2.contains(it) } && l2.all{ l1.contains(it) }

}

// EXERCICI 6
fun sumLists(l1: List<Int>, l2: List<Int>): List<Int>{

    return l1.zip(l2) { e1, e2 -> e1 + e2 }

}

// EXERCICI 7

fun findInsert(orderedList: List<Int>, newNumber: Int): Int{

    orderedList.forEachIndexed{ index, elem -> if (newNumber < elem){ return index} }
    return orderedList.size

}

// EXERCICI 8

fun anonymousMathOperation(a: Int, b: Int, operation: (Int, Int) -> Double): Double{

    return operation(a,b)

}