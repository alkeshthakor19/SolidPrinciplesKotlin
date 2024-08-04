package liskov_substitution.good

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