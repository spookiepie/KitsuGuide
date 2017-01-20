package ua.example.pie.animesearch.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import io.realm.OrderedRealmCollection;
import io.realm.RealmBaseAdapter;
import ua.example.pie.animesearch.R;
import ua.example.pie.animesearch.model.SingleAnime;

/**
 * Created by Pie on 13.11.2016.
 */

public class FavouritesAdapter extends RealmBaseAdapter<SingleAnime> {

    public FavouritesAdapter(@NonNull Context context, @Nullable OrderedRealmCollection<SingleAnime> data) {
        super(context,data);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_anime, viewGroup, false);
        }
        SingleAnime anime = getItem(i);
        TextView animeTitle = (TextView) view.findViewById(R.id.title);
       // TextView animeStatus = (TextView) view.findViewById(R.id.animeStatus);
        TextView episodeCount = (TextView) view.findViewById(R.id.episodeCount);
        animeTitle.setText(anime.getTitle());
        episodeCount.setText(anime.getEpisodeCount());
        //animeStatus.setText(anime.getStatus());


        ImageLoader imageLoader = ImageLoader.getInstance();

        String url = anime.getOriginalImage();

        ImageView smallPicture = (ImageView) view.findViewById(R.id.small_picture);
        imageLoader.displayImage(url, smallPicture);


        return view;
    }
}