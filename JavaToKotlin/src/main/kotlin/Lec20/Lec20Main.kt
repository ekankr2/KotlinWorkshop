package Lec20

import Person

fun printPerson(person: Person?){
    person?.let {
        println(it.name)
        println(it.age)
    }
}

