class Tar(){
    var s = 0
    var d = 0
    fun r():Double{
        return (s*d).toDouble()
    }

}
fun main(){
var a = Tar()
    a.s = readLine()!!.toInt()
    a.d = readLine()!!.toInt()
    println(a.r())
}