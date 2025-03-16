package org.example


class Product(val name: String, val prince: Int)

interface Wheel{
    fun roll()

}
interface Cart : Wheel{
    var coin: Int
    fun add(product: Product)

    fun rent(){

    }

    override fun roll() {
        println("카드가 굴러갑니다.")
    }
}
interface Order {
    fun add(product: Product) {

    }


}

class MyCart(override var coin: Int) : Cart, Order {

    override fun add(product: Product) {
        TODO("Not yet implemented")
    }


}


fun main() {

}