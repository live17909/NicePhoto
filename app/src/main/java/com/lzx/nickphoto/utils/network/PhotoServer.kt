package com.lzx.nickphoto.utils.network

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by lzx on 2017/7/4.
 */
interface PhotoServer {

    @GET("photos?client_id=7be0b533fdf3cd47d7e749f2f7894aaa6c04b16108155266dc944ee3a629926f")
    fun getAllPhoto(@Query("page") page: Int, @Query("per_page") per_page: Int): Observable<ResponseBody>

    @GET("photos/{photoId}?client_id=7be0b533fdf3cd47d7e749f2f7894aaa6c04b16108155266dc944ee3a629926f")
    fun getPhotoDetail(@Path("photoId") photoId: String): Observable<ResponseBody>

    @GET("photos/{photoId}/statistics?client_id=7be0b533fdf3cd47d7e749f2f7894aaa6c04b16108155266dc944ee3a629926f")
    fun getPhotoStatistics(@Path("photoId") photoId: String): Observable<ResponseBody>
}