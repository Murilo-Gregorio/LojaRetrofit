package br.senac.lojaretrofit.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object API {
    private val retrofit: Retrofit
        get(){
            val instanciaRetrofit = Retrofit
                .Builder()
                .baseUrl("https://oficinacordova.azurewebsites.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return instanciaRetrofit
        }

    val produto:ProdutoService
        get(){
            return retrofit.create(ProdutoService::class.java)
        }

        /*val cliente:ClientService
        get() {
            return retrofit.create(ClienteService::class.java)
        }*/
}