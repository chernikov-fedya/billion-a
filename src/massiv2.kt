import kotlin.math.sqrt
class Vector3D(size: Int= readLine()!!.toInt()){
    var sum: Double = 0.0
    var coords: Array<Double> = Array(size, { readLine()!!.toDouble()})
    fun display(){
        coords.forEach { println(it) }
    }
    fun length(): Double {
        for (i in 0..coords.size - 1){
            sum += coords[i]*coords[i]
        }
        return sqrt(sum)
    }
}
fun main(){
    var test = Vector3D()
    test.display()
    print(test.length())
}