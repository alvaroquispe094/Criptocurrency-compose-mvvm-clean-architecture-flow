package com.groupal.cryptocurrency.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.groupal.cryptocurrency.domain.model.Coin

data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

// Just like a mapper
fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive =isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}