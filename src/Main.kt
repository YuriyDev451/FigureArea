import Figure.Circle
import Figure.Rectangle
import Figure.Sphere

//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {

    print("Circle:")
    val circle = readln()

    print("RectangleLength:")
    val rectangleLength = readln()
    print("RectangleWidth:")
    val rectangleWidth = readln()

    print("Sphere:")
    val sphere = readln()


    val shapes: Array<Shape> = arrayOf(
        Circle(circle.toDouble()),
        Rectangle(rectangleLength.toDouble(), rectangleWidth.toDouble()),
        Sphere(sphere.toDouble()) )





    shapes.forEach {

        val name = it.getName()

        when(it) {

            is ThreeDimensional -> println(name+" area" +"="+ it.calculateArea()+"\n"+ name+"Volume= "+ it.calculateVolume())
            is TwoDimensional -> println(name +"="+ it.calculateArea() )
            else -> throw Exception("Error")
        }
    }

}