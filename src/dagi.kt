
import kotlin.math.sqrt
class Vector(){
    var x:Double = 0.0
    var y:Double = 0.0
    var z:Double = 0.0

    constructor(xIn:Double, yIn:Double, zIn:Double):this(){
        x = xIn
        y = yIn
        z = zIn
    }

    fun plus(v: Vector): Vector {
        return Vector(x + v.x, y + v.y, z + v.z)
    }
    fun minus(v: Vector): Vector {
        return Vector(x - v.x, y - v.y, z - v.z)
    }
    fun skalyar(v: Vector):Double{
        var a:Double=
        return (x*v.x + y*v.y + z*v.z)
    }
    fun umnskalyar(b: Int):Vector{
        return Vector(x*b, y*b, z*b)
    }
    fun display(){
            println("x = $x, y = $y, z = $z")
    }
    fun length():Double{
        return sqrt(x*x + y*y + z*z)
    }
}
fun main(){
var one = Vector(3.0, 4.0, 5.0)
var two = Vector(1.0, 2.0, 4.0)
var three = one.plus(two)
    three.display()
var four = one.minus(two)
    four.display()
var ia1 = one.skalyar(two)
    println(ia1)
var ia = one.umnskalyar(4)
    ia.display()
var l1=one.length()
    println(l1)



}