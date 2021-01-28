package com.ge.app

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class HelloController {

    @RequestMapping("hello")
    fun hello(): Any {
        return Person("aaa", "bbb")
    }
}

data class Person(var name: String, var address: String)

fun main() {
    Random.nextInt(100).takeIf { it % 2 == 0 }?.also { println(it) }
}

