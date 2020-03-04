package com.fielldBooking.apiRequest

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApiRequestApplication

fun main(args: Array<String>) {
	runApplication<ApiRequestApplication>(*args){
		setBannerMode(Banner.Mode.OFF)
	}
}
