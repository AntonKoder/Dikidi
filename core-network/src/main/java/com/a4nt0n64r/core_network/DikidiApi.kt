package com.a4nt0n64r.core_network

import com.a4nt0n64r.core_network.data.entities.main_info.MainInfoNM
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface DikidiApi {
    @GET("/home/info")
    fun getMainInfo(@Query("token") token: String? = null): Single<MainInfoNM>

    @GET("/home/info")
    fun getMainInfoByCity(@Query("city_id") cityId: String): Single<MainInfoNM>
}
