package Figure

import Shape
import ShapeType
import ThreeDimensional
import TwoDimensional

class Sphere(val r: Double): TwoDimensional, ThreeDimensional, Shape() {
    override fun calculateVolume(): Double {
        return (4/3) * P*(r*r*r)
    }

    override fun calculateArea(): Double {
        return 4*P*(r*r)
    }

    override fun getName():String {
        return ShapeType.Sphere.name
    }

    companion object{
        const val P = 3.14
    }
}