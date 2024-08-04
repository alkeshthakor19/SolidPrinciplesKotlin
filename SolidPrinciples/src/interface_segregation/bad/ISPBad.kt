package interface_segregation.bad

fun main() {

    val eagle = Eagle()
    val duck = Duck()
    val penguin = Penguin()

    makeFlyableFly(eagle)
    makeFlyableFly(duck)
    makeFlyableFly(penguin)

    makeSwimmableSwim(eagle)
    makeSwimmableSwim(duck)
    makeSwimmableSwim(penguin)
}

fun makeFlyableFly(birdAction: BirdAction) {
    birdAction.fly()
}

fun makeSwimmableSwim(birdAction: BirdAction) {
    birdAction.swim()
}

interface BirdAction {
    fun fly()
    fun swim()
}

open class Bird

class Eagle: Bird(), BirdAction {

    override fun fly() {
        println("Eagle flying super high")
    }

    override fun swim() {
    }
}

class Penguin: Bird(), BirdAction {
    override fun fly() {
    }

    override fun swim() {
        println("Penguin Swimming very fast!")
    }
}

class Duck: Bird(), BirdAction {
    override fun fly() {
        println("Duck flying low")
    }
    override fun swim() {
        println("Duck swimming slow")
    }
}