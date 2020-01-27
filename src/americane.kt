import kotlin.math.PI
open class Figure {
    var x: Float = 0F
    var y: Float = 0F
    open fun space(): Float{
        return 0f
    }
}
class Circle : Figure() {
    var r: Float = 5F
    override fun space(): Float {
        return PI.toFloat() * r * r
    }
}
class Rectangle: Figure(){
    var a: Float = 5F
    var b: Float = 10F
    override fun space(): Float {
        return a * b
        }
}
fun main(){
    var m: Array<Figure> = Array(2, { Figure() })
    m[0] = Circle()
    m[1] = Rectangle()
    m.forEach { println(it.space()) }
}