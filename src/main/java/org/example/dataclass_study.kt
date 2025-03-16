package org.example

class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Dmitry", 29)
    val person2 = Person("toney", 50)

    println(person1 == person2)

}