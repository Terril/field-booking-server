package com.fielldBooking.apiRequest.mongodb

import com.fielldBooking.apiRequest.datamodel.Fields
import org.springframework.data.mongodb.repository.MongoRepository

interface FieldRepository : MongoRepository<Fields, String> {

    fun findFields() : List<Fields>
}