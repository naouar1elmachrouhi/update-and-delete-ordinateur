package com.example.api6

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

data class Ordinateur (
    val id : Int ,
    val name : String ,
    val price : Double ,
    val haveFP : Boolean ,
    val image : String ,
)

data class AddResponse(
    val code : Int ,
    val message : String ,
)


interface ApiService {
    @GET("/OrdiAPI/read/")
    fun getPc():retrofit2.Call<List<Ordinateur>>

    @POST("/OrdiAPI/add/")
    fun addPC(@Body PC: Ordinateur): retrofit2.Call<AddResponse>

    @POST("/OrdiAPI/update/")
    fun upPC(@Body PC: Ordinateur): retrofit2.Call<AddResponse>

    @POST("/OrdiAPI/delete.php")
    fun deletePC(@Body PC: Ordinateur): retrofit2.Call<AddResponse>
}