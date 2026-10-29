package com.example.consumoapi.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val BASE_URL_VIACEP = "https://viacep.com.br/ws/"

class RetrofitFactory {
    private val retrofitFactoryViaCep = Retrofit
        .Builder()
        .baseUrl(BASE_URL_VIACEP)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getEnderecoService(): EnderecoService {
        return retrofitFactoryViaCep.create(EnderecoService::class.java)
    }
}