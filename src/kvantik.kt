import java.util.*
/* lateinit mutbale list {student()} */
class Student{
    lateinit var name: String
    lateinit var surname: String
    lateinit var middlename: String
    lateinit var birthday: Date
    //var awards: Array<String> = Array(readLine()!!.toInt(), { readLine()!! })
}
class Group(){
    var mnames: Array<String> = arrayOf("Иван", "Андрей", "Алексей", "Демьян", "Михаил", "Федор")
    var msurname: Array<String> = arrayOf("Воронин", "Синоев", "Звездаков", "Костылев", "Коновальчук", "Ощепков")
    var mmiddlenames: Array<String> = arrayOf("Сергеевич", "Александрович", "Генадьевич", "Антонович", "Аркадьевич", "Ефимович")
    var students: MutableList<Student> = mutableListOf()
    var groupname: String = ""
    init {
        for (i in 0..5) {
            var  s = Student()
            s.name = mnames[(0..5).random()]
            s.surname = msurname[(0..5).random()]
            s.middlename = mmiddlenames[(0..5).random()]
            s.birthday = Date()
            students.add(s)
        }
    }
}
class Kvant{
    var kvantname: String = ""
    var groups: MutableList<Group> = mutableListOf()
}
class Kvantorium{
    var kvant: MutableList<Kvant> = mutableListOf()
}

fun main() {
    var a = Group()
    for (i in 0..5) {
        println(a.students[i].name + " " + a.students[i].surname + " " + a.students[i].middlename + "   " + a.students[i].birthday)
    }
}