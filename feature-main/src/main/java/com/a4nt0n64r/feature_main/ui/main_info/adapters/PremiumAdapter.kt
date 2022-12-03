package com.a4nt0n64r.feature_main.ui.main_info.adapters

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.a4nt0n64r.dikidi.feature_main.databinding.CategoryItemBinding
import com.a4nt0n64r.dikidi.feature_main.databinding.PremiumItemBinding
import com.a4nt0n64r.feature_main.ui.main_info.entities.VipUI
import com.bumptech.glide.Glide
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

class PremiumAdapter() : AsyncListDifferDelegationAdapter<RecyclerItem>(
    DiffCallback(),
    AdapterDelegatesManager(
        categoriesDelegate(),
    )
)

class DiffCallback : DiffUtil.ItemCallback<RecyclerItem>() {

    override fun areItemsTheSame(oldItem: RecyclerItem, newItem: RecyclerItem): Boolean {
        return oldItem == newItem
    }

    @SuppressLint("DiffUtilEquals") // Сюда попадут только датаклассы,
    // имплементирующие пустой интерфейс, у них equals() будет переопределен
    override fun areContentsTheSame(
        oldItem: RecyclerItem,
        newItem: RecyclerItem
    ): Boolean {
        return oldItem == newItem
    }
}

fun categoriesDelegate() =
    adapterDelegateViewBinding<VipUI, RecyclerItem, PremiumItemBinding>(
        { layoutInflater, root ->
            PremiumItemBinding
                .inflate(layoutInflater, root, false)
        }
    ) {
        bind {

            Glide.with(binding.premiumImage.context)
                .load(item.smallImage)
                .dontAnimate()
                .into(binding.premiumImage)

            binding.premiumHeader.text = item.name
        }
    }
