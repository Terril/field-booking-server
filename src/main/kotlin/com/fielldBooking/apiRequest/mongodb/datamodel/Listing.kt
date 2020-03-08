package com.fielldBooking.apiRequest.mongodb.datamodel

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document data class SportsList(@Id val id: String? = null, val name: String, val imageUrl: String)

@Document data class Fields(@Id val id: String,
                  val title: String,
                  val fieldType: String,
                  val address: String,
                  val lat: Double,
                  val lon: Double,
                  val phoneNumber: Int,
                  val contactPerson: String,
                  val whatsappNumber: Int,
                  val emailAddress: String,
                  val likes: Int,
                  var visitedFriends: List<VisitedFriend> = emptyList())

@Document data class VisitedFriend(val id: Int, val name: String, val phoneNumber: Int, val visitedTimes: Int)