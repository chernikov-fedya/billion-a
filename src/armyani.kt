class Mat{
    var first : Float = 0f
    var second: Float = 0f
    var resX: Int = 1920
    var rexY: Int = 1080
    fun changex() {
            var firstU = readLine()!!.toFloat()
            if (firstU < resX) {
                first = firstU
            }
            else {
                println("Выход за пределы по X")
            }
        }

    fun changey() {
            var secondU = readLine()!!.toFloat()
            if (secondU < rexY) {
                second = secondU
            }
            else {
                println("Выход за пределы по Y")
            }
        }

    fun display() {
        println("$first $second")
    }

}
fun makeC(/*first: Float, second: Float*/): Mat{
    var a = Mat()
   /* a.first = first
    a.second = second */
    a.changex()
    a.changey()
    return a
}
fun main(){
    makeC().display()
}