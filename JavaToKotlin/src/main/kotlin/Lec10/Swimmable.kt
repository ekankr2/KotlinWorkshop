package Lec10

interface Swimmable {

    val swimAbility: Int
        get() = 3

    fun act() {
        println("어푸 어푸")
    }
}