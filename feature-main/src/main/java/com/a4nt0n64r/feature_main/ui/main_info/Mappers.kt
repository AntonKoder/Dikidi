package com.a4nt0n64r.feature_main.ui.main_info

import com.a4nt0n64r.feature_main.ui.main_info.entities.*
import com.a4nt0n64r.feature_main.ui.main_info.entities.VipUI
import com.a4nt0n64r.repository_shop.domain.entities.*

fun Data.toMainDataUI(): MainDataUI {
    return MainDataUI(blocks.toUIModel(), catalogCount, image, title)
}

private fun Blocks.toUIModel(): BlocksUI {
    return BlocksUI(catalog.toCatalogUI(), examples, new.toNewUI(), vip.toVipUI())
}

private fun List<Catalog>.toCatalogUI(): List<CatalogUI> {
    return map {
        CatalogUI(
            it.categories.toCategoriesUI(),
            it.currency.toCurrencyUI(),
            it.house,
            it.id,
            it.image.toUIModel(),
            it.isMaster,
            it.lat,
            it.lng,
            it.name,
            it.rating,
            it.schedule.toScheduleUI(),
            it.street
        )
    }
}

private fun List<Schedule>.toScheduleUI(): List<ScheduleUI> {
    return map { ScheduleUI(it.day, it.workFrom, it.workTo) }
}

private fun Image.toUIModel(): ImageUI {
    return ImageUI(origin, thumb)
}

private fun Currency.toCurrencyUI(): CurrencyUI {
    return CurrencyUI(abbr, id, title)
}

private fun List<Any>.toCategoriesUI(): List<String> {
    return emptyList()
}

private fun List<New>.toNewUI(): List<NewUI> {
    return map { NewUI(it.categories.toCategoriesUI(), it.id, it.image.toUIModel(), it.name) }
}

private fun List<Vip>.toVipUI(): List<VipUI> {
    return map { VipUI(it.id, it.image.thumb, it.name) }
}
