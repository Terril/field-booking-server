package com.fielldBooking.apiRequest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/sports")
class SportsListingController {
    val counter = AtomicLong()

    @GetMapping("/list")
    fun sportsListing() =
            SportsListing(counter.incrementAndGet(), "Hello", "https://www.wikihow.com/images/thumb/1/18/Play-Basketball-Step-4-Version-3.jpg/aid413339-v4-728px-Play-Basketball-Step-4-Version-3.jpg.webp")
}