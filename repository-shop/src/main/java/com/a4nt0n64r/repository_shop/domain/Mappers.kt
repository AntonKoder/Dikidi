package com.a4nt0n64r.repository_shop.domain

import android.util.Log
import com.a4nt0n64r.core_network.data.entities.main_info.*
import com.a4nt0n64r.repository_shop.domain.entities.*

fun DataNM.toDomainModel(): Data {
    return Data(blocks.toDomainModel(), catalogCount, image, title)
}

private fun BlocksNM.toDomainModel(): Blocks {
    return Blocks(catalog.toDomainCatalog(), examples, new.toDomainNew(), vip.toDomainVip())
}

private fun List<VipNM>.toDomainVip(): List<Vip> {
    return map { Vip(it.categories.toDomainCategories(), it.id, it.image.toDomainModel(), it.name) }
}

private fun List<NewNM>.toDomainNew(): List<New> {
    return map { New(it.categories, it.id, it.image.toDomainModel(), it.name) }
}

private fun ImageNM.toDomainModel(): Image {
    return Image(origin, thumb)
}

private fun List<CatalogNM>.toDomainCatalog(): List<Catalog> {
    return map {
        Catalog(
            it.categories.toDomainCategories(),
            it.currency.toDomainModel(),
            it.house,
            it.id,
            it.image.toDomainModel(),
            it.isMaster,
            it.lat,
            it.lng,
            it.name,
            it.rating,
            it.schedule.toDomainSchedule(),
            it.street
        )
    }
}

private fun List<ScheduleNM>.toDomainSchedule(): List<Schedule> {
    return map { Schedule(it.day, it.workFrom, it.workTo) }
}

private fun CurrencyNM.toDomainModel(): Currency {
    return Currency(abbr, id, title)
}

private fun List<Any>.toDomainCategories(): List<String> {
    return emptyList()
}

fun ErrorNM.toDomainError(): String {
    return if (code == 0) "" else message
}


