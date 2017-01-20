package ua.example.pie.animesearch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import ua.example.pie.animesearch.R;
import ua.example.pie.animesearch.model.SingleAnime;


/**
 * Created by Pie on 31.10.2016.
 */

public class AnimesAdapter extends BaseAdapter {

    private List<SingleAnime> animeObjects;
    private Context context;


    @Override
    public int getCount() {
        return animeObjects.size();
    }

    @Override
    public Object getItem(int i) {
        return animeObjects.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_anime, viewGroup, false);


        }

        TextView animeTitle = (TextView) view.findViewById(R.id.title);
        TextView animeAgeRating = (TextView) view.findViewById(R.id.animeStatus);
        TextView episodeCount = (TextView) view.findViewById(R.id.episodeCount);
        animeTitle.setText(animeObjects.get(position).getTitle());
        episodeCount.setText(animeObjects.get(position).getEpisodeCount());
        animeAgeRating.setText(animeObjects.get(position).getAgeRating());


        ImageLoader imageLoader = ImageLoader.getInstance();

        String url = animeObjects.get(position).getOriginalImage();

        ImageView smallPicture = (ImageView)view.findViewById(R.id.small_picture);

        imageLoader.displayImage(url, smallPicture);

        /*
        String imageUrl = animes.get(position).getOriginalImage();

        ImageView smallPicture = (ImageView) view.findViewById(R.id.small_picture);

        SmallPictureLoad pictureLoad = new SmallPictureLoad(imageUrl);

        pictureLoad.execute(smallPicture);
*/
        return view;
    }


    @Override
    public boolean isEmpty() {
        return animeObjects.size() == 0;
    }


    public AnimesAdapter(List<SingleAnime> animeObjects, Context context) {
        this.animeObjects = animeObjects;
        this.context = context;
    }
/*
    //Async load of preview images
    private class SmallPictureLoad extends AsyncTask<ImageView, Void, Bitmap> {

        ImageLoader imageLoader = ImageLoader.getInstance();

        String imageUrl = null;

        ImageView imageView = null;

        Bitmap bmp = null;

        public SmallPictureLoad(String imageUrl) {


            this.imageUrl = imageUrl;
        }

        @Override
        protected Bitmap doInBackground(ImageView... imageViews) {

            this.imageView = imageViews[0];

            Bitmap bmp = imageLoader.loadImageSync(imageUrl);

            return bmp;

        }

        @Override
        protected void onPostExecute(Bitmap result) {


            imageView.setImageBitmap(bmp);
        }

    }
    */
}
