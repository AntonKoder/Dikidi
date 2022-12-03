package com.a4nt0n64r.core_network.data.entities.main_info


import com.google.gson.annotations.SerializedName

data class MainInfoNM(
    @SerializedName("data")
    val mainData: DataNM,
    val error: ErrorNM
)