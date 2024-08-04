package dependancy_inversion.good

// 1. High-level modules should not depend on low-level modules. Both should depend on abstractions
// 2. abstractions should not depend on details. Details should depend on abstractions
// 3. Classes should rely on abstractions (e.g., interfaces or abstract classes) rather than concrete implementations

fun main() {

    val paymentProcessor = PaymentProcessor(PayPalPayment())
    paymentProcessor.processPayment(100.0)

    val paymentProcessor2 = PaymentProcessor(StripePayment())
    paymentProcessor2.processPayment(200.0)
}


interface Payment {
    fun pay(amount: Double)
}


class PaymentProcessor(private val payment: Payment) {
    fun processPayment(amount: Double) {
        payment.pay(amount)
    }
}

class PayPalPayment : Payment{
   override fun pay(amount: Double) {
        println("Proceeding Paypal payment of $amount")
    }
}

class StripePayment : Payment {
    override fun pay(amount: Double) {
        println("Proceeding Stripe payment of $amount")
    }
}