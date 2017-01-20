package ua.example.pie.animesearch.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.nostra13.universalimageloader.core.ImageLoader;

import io.realm.Realm;
import ua.example.pie.animesearch.R;
import ua.example.pie.animesearch.customView.BarChart;
import ua.example.pie.animesearch.model.SingleAnime;

/**
 * Created by HalfLaptop on 08.11.2016.
 */

public class DetailedView extends MainActivity{
    private SingleAnime mAnime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_view);

        TextView animeTitle = (TextView) findViewById(R.id.title);
        TextView animeDescription = (TextView) findViewById(R.id.description);
        TextView animeStatus = (TextView) findViewById(R.id.animeStatus);
        TextView airingEnded = (TextView) findViewById(R.id.airingEnded);
        TextView episodeCount = (TextView) findViewById(R.id.episodeCount);
        TextView episodeLength = (TextView ) findViewById(R.id.episodeLength);
        BarChart barChart = (BarChart) findViewById(R.id.barChart);

        String animeString = getIntent().getStringExtra("anime");
        mAnime = new Gson().fromJson(animeString , SingleAnime.class);
        //parsing rating frequencies to pass them in custom view
        String _00 = mAnime.get_00();
        String _10 = mAnime.get_10();
        String _20 = mAnime.get_20();
        String _30 = mAnime.get_30();
        String _40 = mAnime.get_40();
        String _50 = mAnime.get_50();
// passing values to custom view
        barChart.setValues(_00, _10, _20, _30, _40, _50);

        animeTitle.setText(mAnime.getTitle());
        episodeCount.setText(mAnime.getEpisodeCount());
        animeStatus.setText(mAnime.getStartDate());
        animeDescription.setText(mAnime.getDescription());
        episodeLength.setText(mAnime.getEpisodeLength()+" min");
        airingEnded.setText(mAnime.getEndDate());


        ImageLoader imageLoader = ImageLoader.getInstance();


        String url = mAnime.getOriginalImage();
        ImageView bigPicture = (ImageView)findViewById(R.id.big_picture);
        imageLoader.displayImage(url, bigPicture);
    }

    public void onClickBrowser(View view) {

        Uri uri = Uri.parse("http://www.youtube.com/watch?v="+mAnime.getYoutubeVideoId());
        Intent openBrowser = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(openBrowser);
    }

    public void onClickAdd (View view){
        Realm realm = Realm.getDefaultInstance();

        realm.executeTransactionAsync(new Realm.Transaction(){
            @Override
            public void execute(Realm realm) {
                realm.copyToRealm(mAnime);
            }
        });
    }

}
