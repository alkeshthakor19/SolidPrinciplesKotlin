package liskov_substitution.bad

fun main() {
    val eagle = Eagle()
    val duck = Duck()
    val penguin = Penguin()

    makeBirdFly(eagle)
    makeBirdFly(duck)
    makeBirdFly(penguin)
}

fun makeBirdFly(bird: Bird) {
    bird.fly()
}

open class Bird {
   open fun walk() {
       println("Bird walking!")
   }

    open fun fly() {
        println("Bird flying!")
    }
}

class Eagle : Bird() {
    override fun fly() {
        println("Eagle flying super high!")
    }
}

class Duck: Bird() {
    override fun fly() {
        println("Duck flying slow!")
    }
    override fun walk() {
        println("Duck walking slow!")
    }
}

class Penguin : Bird() {
    override fun fly() {
        throw UnsupportedOperationException("Penguin can't flying")
    }
    override fun walk() {
        println("Penguin walking!")
    }
}



