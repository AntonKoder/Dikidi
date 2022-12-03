package com.a4nt0n64r.repository_shop.domain.entities


data class Catalog(
    val categories: List<Any>,
    val currency: Currency,
    val house: String,
    val id: String,
    val image: Image,
    val isMaster: Boolean,
    val lat: String,
    val lng: String,
    val name: String,
    val rating: Int,
    val schedule: List<Schedule>,
    val street: String
)