class Person : Displayable {
    var name: String = ""
        set(value) {
            println("Setting name to $value")
            field = value
        }
        get() {
            println("Retrieved name: $field")
            return field
        }

    var age: Int = 0
        set(value) {
            println("Retrieved age: $value")
            field = value
        }
        get() {
            println("Retrieved age: $field")
            return field
        }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    override fun displayInfo() {
        println("Name: $name")
        println("Age: $age\n")
    }
}