package Figure

import Shape
import ShapeType
import TwoDimensional

class Rectangle (val length: Double, val width : Double): TwoDimensional, Shape() {


    override fun calculateArea(): Double {
        return length * width
    }

    override fun getName():String {
        return  ShapeType.Rectangle.name
    }
}