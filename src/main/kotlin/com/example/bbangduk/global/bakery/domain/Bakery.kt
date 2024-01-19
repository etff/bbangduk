package com.example.bbangduk.global.bakery.domain

import com.example.bbangduk.global.model.BaseEntity
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Bakery(
    val name: String,
    @get:Embedded
    val location: Location,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
) : BaseEntity()
