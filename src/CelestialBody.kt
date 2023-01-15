open class CelestialBody(
        var distanceToSun: Int,
        var positionInSky: Pair<Int, Int>,
        val isVisibletoNakedEye: Boolean,
        var name: String
) {
    open fun printname() {
        print("Star name:")
    }
}


