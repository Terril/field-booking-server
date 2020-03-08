package com.fielldBooking.apiRequest.controller

import com.fielldBooking.apiRequest.datamodel.Fields
import com.fielldBooking.apiRequest.datamodel.FieldsList
import com.fielldBooking.apiRequest.mongodb.datamodel.SportsList
import com.fielldBooking.apiRequest.mongodb.services.SportsService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

@RestController
@RequestMapping("/sports")
class SportsListController(private val sportService: SportsService) {

    @GetMapping("/list")
    fun getSportsList(pageable: Pageable): Page<SportsList> = sportService.getAll(pageable)
}