package com.a4nt0n64r.feature_main

import com.a4nt0n64r.core_network.DikidiApi
import com.a4nt0n64r.feature_main.domain.GetShopInfoUseCase
import com.a4nt0n64r.repository_shop.data.MainNetworkServiceImpl
import com.a4nt0n64r.repository_shop.domain.MainNetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object MainModule {
    @Provides
    @ViewModelScoped
    fun provideRepo(dikidiApi: DikidiApi): MainNetworkService = MainNetworkServiceImpl(dikidiApi)

    @Provides
    @ViewModelScoped
    fun provideUseCase(mainInfoRepository: MainNetworkService) =
        GetShopInfoUseCase(mainInfoRepository)
}