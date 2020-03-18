package com.fieldBooking.apiRequest.extensions

fun Boolean?.filterNull(defaultValue: Boolean = false): Boolean {
    return this ?: defaultValue
}
