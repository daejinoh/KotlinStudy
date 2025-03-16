package org.example

import java.time.LocalDateTime

//object Singleton {
//
//    val a = 1234
//    fun printA() = println(a)
//
//}
//
//fun main(args: Array<String>) {
//    println(Singleton.a)
//    Singleton.printA()
//}

// signleton을 이용해서 utility를 많이 만든다.
//object DatetimeUtils{
//
//    val now : LocalDateTime
//        get() = LocalDateTime.now()
//
//    //const로 선언하게 되면 java의 상수와 유사하다.
//    const val DEFAULT_FORMAT = "yyyy-MM-DD"
//    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
//        return a == b
//    }
//}
//
//fun main(args: Array<String>) {
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.DEFAULT_FORMAT)
//
//    val now = LocalDateTime.now()
//    println(DatetimeUtils.same(now, now))
//}
