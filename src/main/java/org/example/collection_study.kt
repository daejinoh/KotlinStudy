package org.example

import java.util.LinkedList


fun main() {

    // immutable
    val currencyList = listOf("달러", "유로", "원")

    // mutable
    val mutableCurrencyList = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }
    //immutable set
    val numberSet = setOf(1, 2, 3, 4)

    //mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    // 컬렉션 빌더는 내부에선 mutable 반환은 immutable
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)

    }

    // likedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(4)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        print("${iterator.next()} ")
    }

    println("-=====================")

    for (currency in currencyList) {
        println(currency)
    }

    currencyList.forEach{
        println(it)

    }
    println("-=====================")

    // for loop -> map
    val lowerLIst = listOf("a", "b", "c")
//    val upperLIst = mutableListOf("a", "b", "c")
//    for (lowerCase in lowerLIst) {
//        upperLIst.add(lowerCase.uppercase())
//
//    }

    // map 사용
    val upperList = lowerLIst.map{it.uppercase() }
//    println(upperList)


    // filter 사용-> 특정조건이 만족하는 경우에만 리스트에 담아서 출력
//    val filteredList = mutableListOf<String>()
//    for (upperCase in upperList) {
//        if (upperCase == "A" || upperCase == "B") {
//            filteredList.add(upperCase)
//        }
//    }

    val filteredList = upperList.filter { it == "A" || it == "C" }
    println(filteredList)

}