package com.a4nt0n64r.repository_shop.data

import com.a4nt0n64r.core_network.DikidiApi
import com.a4nt0n64r.core_network.data.entities.main_info.BlocksNM
import com.a4nt0n64r.core_network.data.entities.main_info.DataNM
import com.a4nt0n64r.core_network.data.entities.main_info.ErrorNM
import com.a4nt0n64r.repository_shop.domain.MainNetworkService
import io.reactivex.rxjava3.core.Single

class MainNetworkServiceImpl(
    private val dikidiApi: DikidiApi
) : MainNetworkService {
    override fun getMainInfoByCity(cityId: String): Single<MainNetworkService.MainInfoResult> {
        return dikidiApi.getMainInfo().map {
            try {
                MainNetworkService.MainInfoResult(
                    it.mainData, it.error
                )
            } catch (e: Exception) {
                MainNetworkService.MainInfoResult(
                    data = DataNM(
                        BlocksNM(
                            emptyList(), "",
                            emptyList(), emptyList()
                        ), "", "", ""
                    ), error = ErrorNM(code = 0, "ERROR")
                )
            }
        }
    }
}
