package com.fielldBooking.apiRequest.mongodb

import com.fielldBooking.apiRequest.datamodel.Fields
import com.fielldBooking.apiRequest.datamodel.SportsList
import org.springframework.data.mongodb.repository.MongoRepository

interface SportsRepository : MongoRepository<SportsList, String>
interface FieldRepository : MongoRepository<Fields, String> {

    fun findAllFields(): List<Fields>
}