package com.a4nt0n64r.repository_shop.domain

data class Bucket(
    val basket: List<BucketItem>,
    val delivery: String,
    val id: String,
    val total: Int
)

data class BucketItem(
    val id: Int,
    val images: String,
    val price: Int,
    val title: String
)
