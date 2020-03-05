package com.fielldBooking.apiRequest.controller

import com.fielldBooking.apiRequest.datamodel.Fields
import com.fielldBooking.apiRequest.datamodel.FieldsList
import com.fielldBooking.apiRequest.datamodel.SportsList
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/sports")
class SportsListingController {
    val counter = AtomicLong()

    @GetMapping("/list")
    fun sportsListing(): List<SportsList> {
        val sportList = mutableListOf<SportsList>()
        sportList.add(SportsList(counter.incrementAndGet(), "Hello",
                "https://www.wikihow.com/images/thumb/1/18/Play-Basketball-Step-4-Version-3.jpg/aid413339-v4-728px-Play-Basketball-Step-4-Version-3.jpg.webp"))
        sportList.add(SportsList(counter.incrementAndGet(), "Hello 1",
                "https://www.wikihow.com/images/thumb/1/18/Play-Basketball-Step-4-Version-3.jpg/aid413339-v4-728px-Play-Basketball-Step-4-Version-3.jpg.webp"))
        return sportList.toList()
    }

    @GetMapping("/fields/list")
    fun fieldsListing(): FieldsList {
        val fields = mutableListOf<Fields>()
        val data = Fields(counter.incrementAndGet(), "Matar Ground",
                "something", "something", 1.93489234, 23.55586969, 1122344,
                "Abhay", 1231, "a@a.om", 1123)
        fields.add(data)

        return FieldsList(fields = fields)
    }

}