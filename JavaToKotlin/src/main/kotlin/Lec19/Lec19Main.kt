package Lec19

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val person = Person("임익환", 100)
    // val (name, age) = person
    val name = person.component1()
    val age = person.component2()

    println("이름 : ${name}, 나이 : ${age}")
}