package ua.example.pie.animesearch.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ua.example.pie.animesearch.model.AnimeList;


/**
 * Created by Pie on 28.10.2016.
 */

public interface ApiInterface {
    @GET("anime?filter")
    Call<AnimeList> getAnimeByTitle(@Query("filter[text]") String query);

}
