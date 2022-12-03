package com.a4nt0n64r.repository_shop.domain.entities


data class Blocks(
    val catalog: List<Catalog>,
    val examples: String,
    val new: List<New>,
    val vip: List<Vip>
)