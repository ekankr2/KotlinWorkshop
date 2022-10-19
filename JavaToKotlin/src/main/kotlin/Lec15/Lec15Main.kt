package Lec15

fun main(){
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "Monday"
    oldMap[2] = "Tuesday"

    for (key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries){
        println(key)
        println(value)
    }
}
