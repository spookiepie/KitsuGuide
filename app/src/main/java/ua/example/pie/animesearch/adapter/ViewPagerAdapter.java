package ua.example.pie.animesearch.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ua.example.pie.animesearch.activity.FavouriteFragment;
import ua.example.pie.animesearch.activity.SearchFragment;

/**
 * Created by HalfLaptop on 10.11.2016.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SearchFragment search = new SearchFragment();
                return search;
            case 1:
                FavouriteFragment favourites = new FavouriteFragment();
                return favourites;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

}