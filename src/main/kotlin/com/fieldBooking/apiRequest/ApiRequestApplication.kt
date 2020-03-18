package com.fieldBooking.apiRequest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.fieldBooking.apiRequest.controller"])
class ApiRequestApplication

fun main(args: Array<String>) {
	runApplication<ApiRequestApplication>(*args)
}
