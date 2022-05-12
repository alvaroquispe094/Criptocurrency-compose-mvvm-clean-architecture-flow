package com.groupal.cryptocurrency.domain.repository

import com.groupal.cryptocurrency.data.remote.dto.CoinDetailDto
import com.groupal.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}