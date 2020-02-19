import java.util.*
var mnames: Array<String> = arrayOf("Иван", "Андрей", "Алексей", "Демьян", "Михаил", "Федор")
var msurname: Array<String> = arrayOf("Воронин", "Синоев", "Звездаков", "Костылев", "Коновальчук", "Ощепков")
var mmiddlenames: Array<String> = arrayOf("Сергеевич", "Александрович", "Генадьевич", "Антонович", "Аркадьевич", "Ефимович")

 open class Man {
     var name: String? = null
     var surname: String? = null
     var middlename: String? = null
}

class Student: Man(){
    var birthday: Date? = null

    init {
            name = mnames[(0..5).random()]
            surname = msurname[(0..5).random()]
            middlename = mmiddlenames[(0..5).random()]
            birthday = Date()
    }
    fun display(){
        println(name + " " + surname + " " + middlename + " " + birthday)
    }
}



class Teacher(tname: String, tsurname: String, tmiddlename: String): Man(){
     init {
         name = tname
         surname = tsurname
         middlename = tmiddlename
     }
}
