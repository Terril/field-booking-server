package com.fieldBooking.apiRequest.mongodb.services

import com.fieldBooking.apiRequest.mongodb.BasicCrud
import com.fieldBooking.apiRequest.mongodb.SportsRepository
import com.fieldBooking.apiRequest.mongodb.datamodel.SportsList
import org.springframework.stereotype.Service
import java.util.*

@Service//declare this class as a Service "Component specialization"
class SportsService(private val sportsRepository: SportsRepository) : BasicCrud<String, SportsList> {
    override fun getAll(): List<SportsList> = sportsRepository.findAll()

    override fun getById(id: String): Optional<SportsList> = sportsRepository.findById(id)

    override fun deleteById(id: String): Optional<SportsList> {
        return sportsRepository.findById(id).apply {
            this.ifPresent { sportsRepository.delete(it) }
        }
    }
}