package com.a4nt0n64r.repository_shop.domain.entities

data class New(
    val categories: List<String>,
    val id: String,
    val image: Image,
    val name: String
)