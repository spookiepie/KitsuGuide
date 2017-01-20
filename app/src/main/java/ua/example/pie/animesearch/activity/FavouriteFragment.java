package ua.example.pie.animesearch.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import io.realm.Realm;
import io.realm.RealmResults;
import ua.example.pie.animesearch.R;
import ua.example.pie.animesearch.adapter.FavouritesAdapter;
import ua.example.pie.animesearch.model.Anime;
import ua.example.pie.animesearch.model.SingleAnime;

/**
 * Created by HalfLaptop on 10.11.2016.
 */

public class FavouriteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.favourites_tab, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Realm realm = Realm.getDefaultInstance();
        RealmResults<SingleAnime> animeObject = realm.where(SingleAnime.class).findAllAsync();
        FavouritesAdapter favouritesAdapter = new FavouritesAdapter(getContext(), animeObject);

        ListView listView = (ListView)view.findViewById(R.id.favourites_list);

        listView.setAdapter(favouritesAdapter);


    }

}
