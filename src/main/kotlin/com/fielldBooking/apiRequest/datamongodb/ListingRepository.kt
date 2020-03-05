package com.fielldBooking.apiRequest.datamongodb

import com.fielldBooking.apiRequest.datamodel.Fields
import org.springframework.data.mongodb.repository.MongoRepository

interface ListingRepository : MongoRepository<Fields, String> {

    fun findFields() : List<Fields>
}