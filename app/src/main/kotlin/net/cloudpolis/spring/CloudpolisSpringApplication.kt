package net.cloudpolis.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudpolisSpringApplication

fun main(args: Array<String>) {
	runApplication<CloudpolisSpringApplication>(*args)
}
