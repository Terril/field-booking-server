package com.fielldBooking.apiRequest.mongodb

import com.fielldBooking.apiRequest.mongodb.datamodel.Fields
import com.fielldBooking.apiRequest.mongodb.datamodel.SportsList
import org.springframework.data.mongodb.repository.MongoRepository

interface SportsRepository : MongoRepository<SportsList, String>
interface FieldRepository : MongoRepository<Fields, String> {
    fun findBySportsId(id: String): List<Fields>
    fun findByNameRegex(name: String): List<Fields>
}