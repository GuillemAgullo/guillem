
public open class Star(name: String, distanceToSun: Int, positionInSky: Pair<Int, Int>, isVisibletoNakedEye: Boolean, val luminosity: Double, var temperature: Double, SpectralClass: Boolean, belongsTo: Galaxy) :
        CelestialBody(distanceToSun, positionInSky, isVisibletoNakedEye, name) {

    val Galaxia = belongsTo

    override fun printname() {
        super.printname()
        println(name)
    }

}