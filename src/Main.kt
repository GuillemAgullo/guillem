fun findTheFarthest(celestialBodies: List<CelestialBody>): CelestialBody {


    val posiciomesgran = Pair(0, 0)
    var estrellaresultant = CelestialBody(1, Pair(1, 2), true, "holaquease")
    for (i in celestialBodies) {

        var estrellameslluny = i
        if (estrellameslluny.positionInSky.first + estrellameslluny.positionInSky.second > estrellaresultant.positionInSky.first + estrellaresultant.positionInSky.second) {
            estrellaresultant = estrellameslluny

        }
        for (u in celestialBodies) {

            if (u.positionInSky.first + u.positionInSky.second > posiciomesgran.first + posiciomesgran.second) {
                estrellameslluny = u
            }

        }

    }
    return estrellaresultant
}

fun filterByGalaxy(stars: List<Star>, galaxy: Galaxy): List<Star> {
    return stars.filter { it.Galaxia == galaxy }
}

fun main() {
    val galaxia1 = Galaxy("Milky way", 232, 342, "Dwarf", 235, positionInSky = Pair(54, 78), true)
    val galaxia2 = Galaxy("Andromeda", 540, 200, "Elliptical", 532, positionInSky = Pair(32, 96), true)

    val estrella1 = Star("Alpha Centauri", 4, positionInSky = Pair(134, 432), true, 1.923, 5700.9, true, galaxia1)
    val estrella2 = Star("Dubhe", 24523, positionInSky = Pair(135, 434), true, 19.45, 5000.0, true, galaxia2)
    val estrella3 = Star("tontito centauri", 223, positionInSky = Pair(15, 452), true, 19.45, 5000.0, false, galaxia2)


    val blackHole1 = BlackHole(12.3, 2325.0, true, 673, positionInSky = Pair(435, 235), "Gargantua (referència a interstellar)")

    val hola = findTheFarthest(listOf(estrella1, estrella2, estrella3, galaxia1, blackHole1, galaxia2))

    println("La galaxia que està més lluny del sol és: " + hola.name)


    val estrellagalaxia = filterByGalaxy(listOf(estrella1, estrella2, estrella3), galaxia2)
    val llistadenomsdelesestrellesdelresultatdelafuncio = arrayListOf<String>("")
    for (i in estrellagalaxia){
        llistadenomsdelesestrellesdelresultatdelafuncio.add(i.name)
    }
    println("A la galaxia: ${galaxia2.name}, hi han les estrelles: $llistadenomsdelesestrellesdelresultatdelafuncio")

}