package org.example

// first라는 확장하는 문자열의 첫번째를 가지고 와서 Char로 리턴
fun String.first(): Char {
    return this[0] //this는 확장이 되는 대상의 참조 ABCD가 THIS이다.
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)

}

fun main() {
    println("ABCD".first())
    println("ABCD".addFirst('Z'))
}