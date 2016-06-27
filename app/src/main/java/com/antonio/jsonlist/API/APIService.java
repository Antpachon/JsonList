package com.antonio.jsonlist.API;

import com.antonio.jsonlist.model.Data;
import com.antonio.jsonlist.model.Guide;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("upcomingGuides")
    Call<Data> listGuides();
}
