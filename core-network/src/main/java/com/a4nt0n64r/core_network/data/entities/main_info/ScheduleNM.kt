package com.a4nt0n64r.core_network.data.entities.main_info


import com.google.gson.annotations.SerializedName

data class ScheduleNM(
    val day: String,
    @SerializedName("work_from")
    val workFrom: String,
    @SerializedName("work_to")
    val workTo: String
)