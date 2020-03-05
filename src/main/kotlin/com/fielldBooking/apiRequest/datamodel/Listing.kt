package com.fielldBooking.apiRequest.datamodel

data class SportsList(val id: Long, val name: String, val imageUrl: String)

data class FieldsList(val fields: List<Fields>)

data class Fields(val id: Long,
                  val title: String,
                  val fieldType: String,
                  val address: String,
                  val lat: Double,
                  val lon: Double,
                  val phoneNumber: Long,
                  val contactPerson: String,
                  val whatsappNumber: Long,
                  val emailAddress: String,
                  val likes: Long)