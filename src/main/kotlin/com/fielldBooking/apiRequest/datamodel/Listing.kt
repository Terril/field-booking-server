package com.fielldBooking.apiRequest.datamodel

data class SportsList(val id: Int, val name: String, val imageUrl: String)

data class FieldsList(val fields: List<Fields>)

data class Fields(val id: Int,
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

data class VisitedFriend(val id: Int, val name: String, val phoneNumber: Int, val visitedTimes: Int)