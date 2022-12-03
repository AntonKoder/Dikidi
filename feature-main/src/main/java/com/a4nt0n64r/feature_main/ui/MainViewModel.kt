package com.a4nt0n64r.feature_main.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.a4nt0n64r.feature_main.CITY_ID
import com.a4nt0n64r.feature_main.domain.GetShopInfoUseCase
import com.a4nt0n64r.feature_main.ui.main_info.entities.MainDataUI
import com.a4nt0n64r.feature_main.ui.main_info.toMainDataUI
import com.a4nt0n64r.lib_android_base.BaseViewModel
import com.a4nt0n64r.lib_android_base.domain.OperationResult
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getShopInfoUseCase: GetShopInfoUseCase
) : BaseViewModel() {

    //для простоты не буду разбивать
    private val _mainInfo = MutableLiveData<MainDataUI>()
    val mainInfo: LiveData<MainDataUI> get() = _mainInfo

    private val _error = MutableLiveData<String?>(null)
    val error: LiveData<String?> get() = _error

    init {
        loadData()
    }

    private fun loadData() {
        getShopInfoUseCase.getMainInfoByCityId(cityId = CITY_ID)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                when (it) {
                    is OperationResult.ResultSuccess -> {
                        _mainInfo.postValue(it.result.mainData.toMainDataUI())
                        _error.postValue(it.result.error)
                    }
                    is OperationResult.ResultError -> {
                        //error
                        _error.postValue(it.error)
                    }
                    is OperationResult.ResultNetworkError -> {
                       //error
                        _error.postValue("Network err")
                    }
                }
            }, {
                //error
            }).connect()
    }
}
