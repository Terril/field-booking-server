package com.fielldBooking.apiRequest.mongodb.services

import com.fielldBooking.apiRequest.mongodb.BasicCrud
import com.fielldBooking.apiRequest.mongodb.SportsRepository
import com.fielldBooking.apiRequest.mongodb.datamodel.SportsList
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

@Service//declare this class as a Service "Component specialization"
class SportsService(private val sportsRepository: SportsRepository) : BasicCrud<String, SportsList> {
    override fun getAll(pageable: Pageable): Page<SportsList> = sportsRepository.findAll(pageable)

    override fun getById(id: String): Optional<SportsList> = sportsRepository.findById(id)

    override fun deleteById(id: String): Optional<SportsList> {
        return sportsRepository.findById(id).apply {
            this.ifPresent { sportsRepository.delete(it) }
        }
    }
}