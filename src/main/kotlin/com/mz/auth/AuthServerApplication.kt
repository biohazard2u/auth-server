package com.mz.auth

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication						// same as @Configuration @EnableAutoConfiguration @ComponentScan
open class AuthServerApplication

fun main(args: Array<String>) {
	//runApplication<AuthServerApplication>(*args)
	SpringApplication.run(AuthServerApplication::class.java, *args)
	println("Starting this Kotlin application")
}
