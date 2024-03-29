package com.example.bbangduk.bakery.domain

import jakarta.persistence.Embeddable

@Embeddable
data class Location(
    val city: String?,
    val address: String?,
    val longitude: Double?,
    val latitude: Double?,
)
