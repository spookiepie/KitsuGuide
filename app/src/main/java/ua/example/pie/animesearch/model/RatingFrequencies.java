package ua.example.pie.animesearch.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HalfLaptop on 23.12.2016.
 */

public class RatingFrequencies {

    @SerializedName("0.0")
    private String _00;
    @SerializedName("0.5")
    private String _05;
    @SerializedName("1.0")
    private String _10;
    @SerializedName("1.5")
    private String _15;
    @SerializedName("2.0")
    private String _20;
    @SerializedName("2.5")
    private String _25;
    @SerializedName("3.0")
    private String _30;
    @SerializedName("3.5")
    private String _35;
    @SerializedName("4.0")
    private String _40;
    @SerializedName("4.5")
    private String _45;
    @SerializedName("5.0")
    private String _50;



    public String get_00() {
        return _00;
    }

    public void set_00(String _00) {
        this._00 = _00;
    }

    public String get_05() {
        return _05;
    }

    public void set_05(String _05) {
        this._05 = _05;
    }

    public String get_10() {
        return _10;
    }

    public void set_10(String _10) {
        this._10 = _10;
    }

    public String get_15() {
        return _15;
    }

    public void set_15(String _15) {
        this._15 = _15;
    }

    public String get_20() {
        return _20;
    }

    public void set_20(String _20) {
        this._20 = _20;
    }

    public String get_25() {
        return _25;
    }

    public void set_25(String _25) {
        this._25 = _25;
    }

    public String get_30() {
        return _30;
    }

    public void set_30(String _30) {
        this._30 = _30;
    }

    public String get_35() {
        return _35;
    }

    public void set_35(String _35) {
        this._35 = _35;
    }

    public String get_40() {
        return _40;
    }

    public void set_40(String _40) {
        this._40 = _40;
    }

    public String get_45() {
        return _45;
    }

    public void set_45(String _45) {
        this._45 = _45;
    }

    public String get_50() {
        return _50;
    }

    public void set_50(String _50) {
        this._50 = _50;
    }

/*

    public HashMap<String, String> getRatingFrequencies() {


        HashMap<String,String> map = new HashMap<>();
        for (String i : ratingFrequencies) map.put(i,i);
        return map;
    }
    */
}
