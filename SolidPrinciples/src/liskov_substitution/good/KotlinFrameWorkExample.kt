package liskov_substitution.good

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val list1: MutableList<String> = ArrayList<String>()
    list1.add("John")
    list1.add("Mary")
    list1.add("Peter")

    printList(list1)

    val list2: MutableList<String> = LinkedList<String>()
    list2.add("Alkesh")
    list2.add("Aanav")

    println(list2)
}


fun printList(list: List<String>) {
    for (item in list) {
        println(item)
    }
}