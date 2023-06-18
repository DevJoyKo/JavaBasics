package com.javabasic.de.java.clip18;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {
    @GET("/api/users/")
//    TODO Object Json parse
    Call<String> retrofitTest(@Query("page") int page);

}
