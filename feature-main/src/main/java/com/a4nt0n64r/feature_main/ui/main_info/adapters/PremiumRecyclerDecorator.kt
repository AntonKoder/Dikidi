package com.a4nt0n64r.feature_main.ui.main_info.adapters

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class PremiumRecyclerDecorator(context: Context, space: Int = 8) : RecyclerView.ItemDecoration() {

    private val spaceInDp = dpToPx(context, space)

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.top = 0
            outRect.bottom = spaceInDp
            outRect.left = spaceInDp
            outRect.right = spaceInDp
        } else {
            outRect.bottom = spaceInDp
            outRect.left = spaceInDp
            outRect.right = spaceInDp
            outRect.top = spaceInDp
        }
    }
}

fun dpToPx(context: Context, dp: Int): Int {
    return (dp * context.resources.displayMetrics.density).toInt()
}