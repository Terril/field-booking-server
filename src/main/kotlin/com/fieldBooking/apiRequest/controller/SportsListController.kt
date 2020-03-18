package com.fieldBooking.apiRequest.controller

import com.fieldBooking.apiRequest.mongodb.datamodel.SportsList
import com.fieldBooking.apiRequest.mongodb.services.SportsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sports")
class SportsListController(private val sportService: SportsService) {

    @GetMapping("/list")
    fun getSportsList(): List<SportsList> = sportService.getAll()
}