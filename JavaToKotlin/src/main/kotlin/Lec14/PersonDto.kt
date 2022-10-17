package Lec14

fun main() {
    val dto1 = PersonDto("임익환", 100)
    val dto2 = PersonDto("임익환", 200)
    println(dto1)
}

data class PersonDto(
    val name: String,
    val age: Int
)