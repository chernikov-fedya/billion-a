import kotlin.math.sqrt
class Vector3d(){
    var x:Float = 0f
    var y:Float = 0f
    var z:Float = 0f
    constructor(xF:Float, yF:Float, zF:Float):this(){
        x = xF
        y = yF
        z = zF
    }

    fun plus(v: Vector3d): Vector3d{
        return Vector3d(x + v.x,y + v.y, z + v.z)
    }
    fun minus(v: Vector3d): Vector3d{
        return Vector3d(x - v.x,y - v.y, z - v.z)
    }
    fun skalyar(v: Vector3d): Float{
        return x * v.x + y * v.y + z * v.z
    }
    fun multiplicationskalyar(k: Int): Vector3d{
        return Vector3d(x * k,y * k, z * k)
    }
    fun length(): Double{
        return sqrt(x*x + y*y + z*z).toDouble()
    }
    fun display(){
        println("x = $x y = $y z = $z")
    }
}
fun main(){
    var one = Vector3d(3f, 4f, 5f)
    var two = Vector3d(6f, 7f, 8f)
    var three = one.plus(two)
    three.display()
    var four = one.minus(two)
    four.display()
    var five = one.skalyar(two)
    println(five)
    var six = one.multiplicationskalyar(5)
    six.display()
    var seven = one.length()
    println(seven)


}