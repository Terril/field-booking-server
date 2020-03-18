package com.fieldBooking.apiRequest.extensions

import com.fieldBooking.apiRequest.mongodb.util.Objects
import java.time.LocalDate

fun String.toLocalDate() = LocalDate.parse(this, Objects.dateFormat)