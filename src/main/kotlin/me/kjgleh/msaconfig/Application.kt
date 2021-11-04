package me.kjgleh.msaconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MsaConfigApplication

fun main(args: Array<String>) {
    runApplication<MsaConfigApplication>(*args)
}
