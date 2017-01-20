package ua.example.pie.animesearch.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ua.example.pie.animesearch.R;
import ua.example.pie.animesearch.adapter.AnimesAdapter;
import ua.example.pie.animesearch.customView.BarChart;
import ua.example.pie.animesearch.model.Anime;
import ua.example.pie.animesearch.model.AnimeList;
import ua.example.pie.animesearch.model.SingleAnime;
import ua.example.pie.animesearch.rest.ApiClient;
import ua.example.pie.animesearch.rest.ApiInterface;

/**
 * Created by HalfLaptop on 10.11.2016.
 */

public class SearchFragment extends Fragment implements SearchView.OnQueryTextListener{



    private static final String TAG = SearchFragment.class.getSimpleName();
    SearchView searchView;
    ListView animesListView;
    private BarChart barChart;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.search_tab, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Context context = getActivity();

        searchView = (SearchView)getView().findViewById(R.id.search);
        searchView.setOnQueryTextListener(this);
        animesListView = (ListView)getView().findViewById(R.id.animes_list_view);

    }

    @Override
    public boolean onQueryTextSubmit(String s) {

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<AnimeList> call = apiService.getAnimeByTitle(s);
        call.enqueue(new Callback<AnimeList>() {
            @Override
            public void onResponse(Call<AnimeList> call, Response<AnimeList> response) {

                final List<Anime> animes = response.body().getResults();
                final List <SingleAnime> animeObjects = new ArrayList<>();
                for (Anime anime: animes)
                {
                    animeObjects.add(new SingleAnime(anime));
                }
                final AnimesAdapter adapter = new AnimesAdapter(animeObjects, getActivity() );
                animesListView.setAdapter(adapter);
                animesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                        Intent intent = new Intent(getActivity(), DetailedView.class);
                        SingleAnime anime = animeObjects.get(i);
                        Gson gson = new Gson();
                        String animeObject = gson.toJson(anime);
                        intent.putExtra("anime",animeObject);
                        startActivity(intent);




                    }
                });
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<AnimeList> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });

        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }

    }









