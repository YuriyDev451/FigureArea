package Figure

import Shape
import ShapeType
import TwoDimensional

class Circle(val r: Double): TwoDimensional, Shape() {


    override fun calculateArea():Double {
        return P*(r*r)
    }

    override fun getName(): String {
        return ShapeType.Circle.name
    }


    companion object{
        const val P = 3.14
    }
}