package dependancy_inversion.bad

// 1. High-level modules should not depend on low-level modules. Both should depend on abstractions
// 2. abstractions should not depend on details. Details should depend on abstractions
// 3. Classes should rely on abstractions (e.g., interfaces or abstract classes) rather than concrete implementations

fun main() {

    val paymentProcessor = PaymentProcessor(PayPalPayment())
    paymentProcessor.processPayment(100.0)
}

class PaymentProcessor(private val payment: PayPalPayment) {
    fun processPayment(amount: Double) {
        payment.pay(amount)
    }
}

class PayPalPayment {
    fun pay(amount: Double) {
        println("Proceeding Paypal payment of $amount")
    }
}