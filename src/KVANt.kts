import java.util.*
/* lateinit mutbale list {student()} */
class Student{
    var name: String = "123"
    var surname: String = readLine()!!
    var middlename: String = readLine()!!
    var birthday: Date = Date()
    var awards: Array<String> = Array(readLine()!!.toInt(), { readLine()!! })

}
class Group{
    var groupname: String = ""
    var students: Array<Student> = arrayOf()
}
class Kvant{
    var kvantname: String = ""
    var groups: Array<Group> = arrayOf()
}
class Kvantorium{
    var kvant: Array<Kvant> = arrayOf()
}

fun main(){
 var a = Student()
    println(a.name)
}