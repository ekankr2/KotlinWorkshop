fun main() {
    val person = Person("공부하는 개발자")
    startsWithA(person.name) // 자바 코드를 읽으면서 null 가능성 확인해야함
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}