package com.a4nt0n64r.core_network.data.entities.main_info


import com.google.gson.annotations.SerializedName

data class DataNM(
    val blocks: BlocksNM,
    @SerializedName("catalog_count")
    val catalogCount: String,
    val image: String,
    val title: String
)