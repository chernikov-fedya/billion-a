import java.util.*
import kotlin.random.Random

fun main(){
    var massiv: Array<Float> = Array(10, {Random.nextFloat()})
    var sum: Float = 0f
    var arif: Float = 0f
    for (i in 0..massiv.size - 1){
        sum += massiv[i]
    }
    println(sum)
    fun ariff(){
        arif=sum/massiv.size
        println(arif)
    }
    ariff()

}