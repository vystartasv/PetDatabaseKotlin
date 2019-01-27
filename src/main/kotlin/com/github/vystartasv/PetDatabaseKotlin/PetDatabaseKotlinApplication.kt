package com.github.vystartasv.PetDatabaseKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetDatabaseKotlinApplication

fun main(args: Array<String>) {
	runApplication<PetDatabaseKotlinApplication>(*args)
}

