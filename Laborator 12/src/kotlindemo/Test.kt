package kotlindemo

import java.util.stream.Collectors
import java.util.stream.Stream

class C1

class C2(private val m1: Int, private val m2: String) {
    override fun toString(): String {
        return "$m2: $m1";
    }
}

class C3(private val m1: String) {
    var m2: Int = 5

    constructor(m1: String, m2: Int): this(m1) {
        this.m2 = m2
    }
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun add2(x: Int, y: Int) = x + y

data class User(val name: String, val id: Int)

fun main() {
    val c2 = C2(5, "Gigel")
    println(c2)

    val c3 = C3("Ionel", 2)

    val x = add(3, 5)
    println(x)
//
    val user = User("Gigel", 10)
    println(user)

    val map = mutableMapOf<Int, Int>()
    map[5] = 10
    println(map.getOrElse(5) {2})
    println(map.getOrElse(3) {10})

    val stream = Stream.of(1, 2, 3, 4, 5, 6)
    println(stream.filter { i -> i and 1 == 0 }.collect(Collectors.toList()))
}