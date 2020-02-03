import kotlin.system.exitProcess

class Data{
    var day: Int = 0
    var month: Int = 0
    var year: Int = 0
    fun visokos():Int {
        if ((year % 4 == 0) || (year % 4 == 0 && year % 100 == 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) )
            println("Високосный")
        else
            println("Не високосный")
        return 0
    }
}
class Account{
    var data = Data()
    var suma: Int = 0
    fun procent(): Double{
        return suma + suma * 0.01
    }
    fun newday(): Int{
        data.day += 1
        if (data.day == 30){
            data.month += 1
            data.day = 1
        }
        if ((data.day == 30) && (data.month == 12)) {
            data.year += 1
            data.day = 1
            data.month = 1
        }
        return 0
    }
}
fun main(){

}
