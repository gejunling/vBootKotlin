package com.ge.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BootKotlinApplication

fun main(args: Array<String>) {
    runApplication<BootKotlinApplication>(*args)
}
