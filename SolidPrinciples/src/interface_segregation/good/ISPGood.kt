package interface_segregation.good

fun main() {

    val eagle = Eagle()
    val duck = Duck()
    val penguin = Penguin()

    makeFlyableFly(eagle)
    makeFlyableFly(duck)

    makeSwimmableSwim(duck)
    makeSwimmableSwim(penguin)
}

fun makeFlyableFly(birdAction: Flyable) {
    birdAction.fly()
}

fun makeSwimmableSwim(birdAction: Swimmable) {
    birdAction.swim()
}

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

open class Bird

class Eagle: Bird(), Flyable {
    override fun fly() {
        println("Eagle flying super high")
    }
}

class Penguin: Bird(), Swimmable {
    override fun swim() {
        println("Penguin Swimming very fast!")
    }
}

class Duck: Bird(), Flyable, Swimmable {
    override fun fly() {
        println("Duck flying low")
    }
    override fun swim() {
        println("Duck swimming slow")
    }
}