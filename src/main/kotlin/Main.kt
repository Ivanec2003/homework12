fun main() {
    val firstNum = 12
    val secondNum = 13
    println("Result of sum: " + getSumTwoArgs(firstNum, secondNum) + "\n")

    val listMutable = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    listMutable.forEach { println(it) }
    listMutable.add(11)
    listMutable.forEach { println(it) }

    val person = Person("Vlad", 21)
    println("Name: ${person.name}")
    println("Age: ${person.age}\n")

    person.name = "Max"
    person.age = 20
    println("Name: ${person.name}")
    println("Age: ${person.age}\n")

    val mapPerson = mutableMapOf<String, Person>()
    mapPerson["Vlad"] = Person("Vlad", 21)
    mapPerson["Max"] = Person("Max", 25)
    mapPerson["John"] = Person("John", 36)
    mapPerson["Dan"] = Person("Dan", 48)
    println("\n")
    mapPerson.forEach { (_, person) ->
        person.displayInfo()
    }

}