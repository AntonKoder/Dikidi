package com.a4nt0n64r.feature_main.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.a4nt0n64r.dikidi.feature_main.R
import com.a4nt0n64r.dikidi.feature_main.databinding.FragmentMainBinding
import com.a4nt0n64r.feature_main.ui.main_info.adapters.PremiumAdapter
import com.a4nt0n64r.feature_main.ui.main_info.adapters.PremiumRecyclerDecorator
import com.a4nt0n64r.lib_android_base.BaseFragment
import com.a4nt0n64r.lib_android_base.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment(R.layout.fragment_main) {

    private val binding by viewBinding<FragmentMainBinding>()
    private val viewModel: MainViewModel by viewModels()

    private val premiumAdapter = PremiumAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        initObservers()
    }

    private fun initViews() {
        setupRecyclerView()
    }

    private fun initObservers() {
        viewModel.mainInfo.observe(viewLifecycleOwner) {
            premiumAdapter.items = it.blocks.vip
        }
    }

    private fun setupRecyclerView() {
        with(binding.premiumList){
            this.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            this.adapter = premiumAdapter
            this.addItemDecoration(PremiumRecyclerDecorator(requireContext()))
        }
    }
}
