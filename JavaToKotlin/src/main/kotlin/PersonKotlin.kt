fun main() {
}

class PersonKotlin(
    name: String = "임익환", var age: Int = 1
) {

    var name = name
        set(value) {
            field = value.uppercase()
        }

    fun getUppercaseName(): String {
        return this.name.uppercase()
    }

    val upperCaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
        println("초기화 블록")
    }

    val isAdult: Boolean
        get() = this.age >= 20

}