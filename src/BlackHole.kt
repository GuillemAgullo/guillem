import kotlin.math.pow

class BlackHole(
        val rotationVelocity: Double,
        val mass: Double,
        val idPrimitive: Boolean,
        distanceToSun: Int,
        positionInSky: Pair<Int, Int>,
        name: String
) :
        CelestialBody(distanceToSun, positionInSky, false, name) {
    fun calculateSchwarszscHildRadius(): Double? {
        val G = 6.67 * 10.0.pow(-11.0)
        val c = 3.0 * 10.0.pow(8.0)
        if (rotationVelocity == 0.0) {
            val radio = (2.0 * G * mass) / c.pow(2.0)
            return radio
        }
        return null
    }
}