package org.example

enum class PaymentStatus(val label: String) : Payable{
    UNPAID("미지급") {
        override fun isPayable() = true
    }
}
interface Payable {
    fun isPayable(): Boolean
}

fun main() {
    print(PaymentStatus.UNPAID.label)
}