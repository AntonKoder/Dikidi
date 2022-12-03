package com.a4nt0n64r.core_network.data.entities.main_info


data class CatalogNM(
    val categories: List<Any>,
    val currency: CurrencyNM,
    val house: String,
    val id: String,
    val image: ImageNM,
    val isMaster: Boolean,
    val lat: String,
    val lng: String,
    val name: String,
    val rating: Int,
    val schedule: List<ScheduleNM>,
    val street: String
)