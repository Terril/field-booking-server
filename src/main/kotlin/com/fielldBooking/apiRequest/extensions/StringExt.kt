package com.fielldBooking.apiRequest.extensions

import com.fielldBooking.apiRequest.mongodb.util.Objects
import java.time.LocalDate

fun String.toLocalDate() = LocalDate.parse(this, Objects.dateFormat)