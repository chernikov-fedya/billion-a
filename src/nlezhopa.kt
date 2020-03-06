import java.util.*
import java.util.logging.Handler
import java.util.Timer
import kotlin.concurrent.fixedRateTimer
import kotlin.concurrent.schedule




class Kachok(){
    var IMB: Int? = null
    var goal: Int? = null   //1 - работа на силу, 2 - на массу, 3 - на выносливость
    init {
        println("Введите Индекс массы тела и тип тренировки")
        IMB = readLine()!!.toInt()
        goal = readLine()!!.toInt()
    }
}
class Excercise(){
    var defaultRest: Double = 30.0
    var podxod: Int? = null
    var povtor: Int? = null
    var trainingWeight: Double = 1.0 // здеь стандартный наальный вес для упражнения
    fun restPlus(){
        println("Достаточно ли времени на отдых: Y-YES, N-NOW")
        var o: String = readLine()!!
        when (o){
            "Y", "YES", "y", "yes" -> return
            else -> defaultRest = defaultRest + defaultRest * 0.2
        }
    }
    fun havearest(){
        println("Отдохни $defaultRest секунд")
    }

    fun pluskg() {
        println("Была ли тренировка трудной?")
        var c: String = readLine()!!
        when (c) {
            "y", "Y", "YES", "yes" -> null
            else -> trainingWeight = trainingWeight + trainingWeight * 0.1
        }
        var n: Long = 10000
        println("Приходи через $n")
        Thread.sleep(n)
    }


}


fun main(){
    var a = Kachok()
    var b = Excercise()
    when (a.goal){
        1 -> {
            b.podxod = 3
            when (a.IMB){
                in 1..19 ->{
                    b.povtor = 5
                    b.trainingWeight = 15.0
                }
                in 20..25-> {
                    b.povtor=6
                    b.trainingWeight = 20.0
                }
                in 25..999->{
                    b.trainingWeight = 15.0
                    b.povtor=7
                }
            }
        }
        2 -> {
            b.podxod = 5
            when (a.IMB){
                in 1..19 ->{
                    b.trainingWeight = 8.0
                    b.povtor=7
                }
                in 20..25-> {
                    b.trainingWeight = 10.0
                    b.povtor=8
                }
                in 25..999->{
                    b.trainingWeight = 8.0
                    b.povtor=10
                }
            }
        }
        3 ->{
            b.podxod = 5
            when (a.IMB){
                in 1..19 ->b.povtor=12
                in 20..25-> b.povtor=15
                in 25..999->b.povtor=17
            }
            b.trainingWeight = 2.0
        }
    }
    loop@ for(k in 1..2) {  //тестовый цикл
        for (i in 1..b.podxod!!) {
            println("Сделать ${b.povtor} повторов, вес: ${b.trainingWeight}")
            b.havearest()
            b.restPlus()
            when (i) {
                b.podxod -> b.pluskg()
            }
        }
    }
}



