package com.a4nt0n64r.feature_main.domain

import com.a4nt0n64r.repository_shop.domain.entities.MainInfo
import com.a4nt0n64r.lib_android_base.domain.OperationResult
import com.a4nt0n64r.repository_shop.domain.MainNetworkService
import com.a4nt0n64r.repository_shop.domain.toDomainError
import com.a4nt0n64r.repository_shop.domain.toDomainModel
import io.reactivex.rxjava3.core.Single

class GetShopInfoUseCase(
    private val mainNetworkService: MainNetworkService
) {
    fun getMainInfoByCityId(cityId: String): Single<OperationResult<MainInfo>> {
        return mainNetworkService.getMainInfoByCity(cityId)
            .map<OperationResult<MainInfo>> {
                OperationResult.ResultSuccess(
                    MainInfo(
                        it.data.toDomainModel(),
                        it.error.toDomainError()
                    )
                )
            }
            .onErrorReturn { OperationResult.ResultError(it.message ?: "") }
    }
}
