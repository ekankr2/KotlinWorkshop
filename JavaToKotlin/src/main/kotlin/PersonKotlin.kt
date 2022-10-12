fun main() {
}

class PersonKotlin(
    val name: String = "임익환", var age: Int = 1
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
        println("초기화 블록")
    }
}