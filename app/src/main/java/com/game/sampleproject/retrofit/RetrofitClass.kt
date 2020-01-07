package com.status.a2zstatus.retrofit


import java.util.*
import com.status.a2zstatus.model.ResponseModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST
import retrofit2.http.Query

class RetrofitClass(private var retrofit: Retrofit? = null){
     val baseurl = "base url"
    fun createRetrofit(): RetrofitInterface? {
        if(retrofit == null){
            retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseurl)
                .build();
        }
        return retrofit?.create(RetrofitInterface::class.java)
    }
    interface RetrofitInterface {
        @POST("hin")
        fun getAllImages(@Query("e")isLast: Boolean): Observable<ResponseModel>;
    }
}