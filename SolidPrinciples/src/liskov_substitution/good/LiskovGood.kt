package liskov_substitution.good

// 1. Subclass should extend the capability of parent class not narrow it down.
// 2. If class B is subtype of class , then we should be able to replace object of A with B without breaking the behaviour of the program


fun main() {

    val eagle = Eagle()
    val duck = Duck()
    val penguin = Penguin()

    makeBirdFly(eagle)
    makeBirdFly(duck)
    //makeBirdFly(penguin)
}

fun makeBirdFly(flyable: Flyable) {
    flyable.fly()
}

interface Flyable {
    fun fly() {
        println("Flying fly")
    }
}

open class Bird {
    open fun walk() {
        println("Bird walking!")
    }
   /* open fun fly() {
        println("Bird flying!")
    }*/
}

class Eagle : Bird(), Flyable {
    override fun fly() {
        println("Eagle flying super high!")
    }
}

class Duck: Bird(), Flyable {
    override fun fly() {
        println("Duck flying slow!")
    }
    override fun walk() {
        println("Duck walking slow!")
    }
}

class Penguin : Bird() {
    /*override fun fly() {
        throw UnsupportedOperationException("Penguin can't flying")
    }*/
    override fun walk() {
        println("Penguin is walking funny")
    }
}