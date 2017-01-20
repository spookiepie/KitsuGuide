package ua.example.pie.animesearch.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by HalfLaptop on 22.12.2016.
 */

public class SingleAnime extends RealmObject{

    @PrimaryKey
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    public String title;
    @SerializedName("episodes")
    private String episodeCount;
    @SerializedName("originalImage")
    private String originalImage;
    @SerializedName("description")
    private String description;
    @SerializedName("selfLink")
    private String selfLink;
    @SerializedName("startDate")
    private String startDate;
    @SerializedName("ageRatingGuide")
    private String ageRatingGuide;
    @SerializedName("youtubeVideoId")
    private String youtubeVideoId;
    @SerializedName("endDate")
    private String endDate;
    @SerializedName("ageRating")
    private String ageRating;
    @SerializedName("episodeLength")
    private String episodeLength;

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



    public SingleAnime(){}

    public SingleAnime(Anime anime){

        this.id = anime.getId();
        this.title = anime.attributes.getCanonicalTitle();
        this.episodeCount = anime.attributes.getEpisodeCount();
        this.originalImage = anime.attributes.posterImage.getOriginal();
        this.description = anime.attributes.getSynopsis();
        this.selfLink = anime.links.getSelf();
        this.startDate = anime.attributes.getStartDate();
        this._00 = anime.attributes.ratingFrequencies.get_00();
        this._05 = anime.attributes.ratingFrequencies.get_05();
        this._10 = anime.attributes.ratingFrequencies.get_10();
        this._15 = anime.attributes.ratingFrequencies.get_15();
        this._20 = anime.attributes.ratingFrequencies.get_20();
        this._25 = anime.attributes.ratingFrequencies.get_25();
        this._30 = anime.attributes.ratingFrequencies.get_30();
        this._40 = anime.attributes.ratingFrequencies.get_40();
        this._45 = anime.attributes.ratingFrequencies.get_45();
        this._50 = anime.attributes.ratingFrequencies.get_50();
        this.ageRatingGuide = anime.attributes.getAgeRatingGuide();
        this.youtubeVideoId = anime.attributes.getYoutubeVideoId();
        this.endDate = anime.attributes.getEndDate();
        this.ageRating = anime.attributes.getAgeRating();
        this.episodeLength = anime.attributes.getEpisodeLength();
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getEpisodeCount() {
        return episodeCount;
    }

   public String getOriginalImage() {
   return originalImage;}

    public String getDescription() {
        return description;
    }

    public String getSelfLink() {
        return selfLink;
    }


    public String get_00() {
        return _00;
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

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public String getAgeRatingGuide() {
        return ageRatingGuide;
    }

    public void setAgeRatingGuide(String ageRatingGuide) {
        this.ageRatingGuide = ageRatingGuide;
    }

    public String getYoutubeVideoId() {
        return youtubeVideoId;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public String getEpisodeLength() {
        return episodeLength;
    }
}
