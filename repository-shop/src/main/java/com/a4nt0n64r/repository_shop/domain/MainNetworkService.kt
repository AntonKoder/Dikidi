package com.a4nt0n64r.repository_shop.domain

import com.a4nt0n64r.core_network.data.entities.main_info.DataNM
import com.a4nt0n64r.core_network.data.entities.main_info.ErrorNM
import io.reactivex.rxjava3.core.Single

interface MainNetworkService {
    fun getMainInfoByCity(cityId: String): Single<MainInfoResult>

    data class MainInfoResult(
        val data: DataNM,
        val error: ErrorNM
    )
}
