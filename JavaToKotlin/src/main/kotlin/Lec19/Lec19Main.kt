package Lec19

class Person(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {
    val person = Person("임익환", 100)
    val (name, age) = person

    println("이름 : ${name}, 나이 : ${age}")
}