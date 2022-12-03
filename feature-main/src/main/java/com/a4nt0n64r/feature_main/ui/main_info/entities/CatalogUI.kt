package com.a4nt0n64r.feature_main.ui.main_info.entities


data class CatalogUI(
    val categories: List<Any>,
    val currency: CurrencyUI,
    val house: String,
    val id: String,
    val image: ImageUI,
    val isMaster: Boolean,
    val lat: String,
    val lng: String,
    val name: String,
    val rating: Int,
    val schedule: List<ScheduleUI>,
    val street: String
)