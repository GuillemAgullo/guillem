import java.lang.reflect.Type

public open class Galaxy(name: String, val luminosity: Int, val CelestialBodies: Int, val type: String, distanceToSun: Int, positionInSky: Pair<Int, Int>, isVisibletoNakedEye: Boolean)
    : CelestialBody(distanceToSun, positionInSky, isVisibletoNakedEye, name) {

}