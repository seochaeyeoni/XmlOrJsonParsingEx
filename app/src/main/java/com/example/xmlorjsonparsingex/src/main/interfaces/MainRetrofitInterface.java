package com.example.xmlorjsonparsingex.src.main.interfaces;


import com.example.xmlorjsonparsingex.src.main.models.DefaultResponse;
import com.example.xmlorjsonparsingex.src.main.models.RiseSetInfoResponse;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MainRetrofitInterface {
//    @GET("/test")

    @GET("getAreaRiseSetInfo")
    Call<RiseSetInfoResponse> getTest(
            @Query("location") final String location,
            @Query("locdate") final int locdate,
            @Query("ServiceKey") final String serviceKey
    );

//    @GET("/test/{number}")
//    Call<DefaultResponse> getTestPathAndQuery(
//            @Path("number") int number,
//            @Query("content") final String content
//    );
//
//    @POST("/test")
//    Call<DefaultResponse> postTest(@Body RequestBody params);
}
