package ua.example.pie.animesearch.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HalfLaptop on 23.12.2016.
 */

public class Attributes {
    @SerializedName("synopsis")
    private String synopsis;

    @SerializedName("canonicalTitle")
    public String canonicalTitle;
    @SerializedName("averageRating")
    private double averageRating;
    @SerializedName("startDate")
    private String startDate;
    @SerializedName("endDate")
    private String endDate;
    @SerializedName("episodeCount")
    private String episodeCount;
    @SerializedName("episodeLength")
    private String episodeLength;
    @SerializedName("youtubeVideoId")
    private String youtubeVideoId;
    @SerializedName("ageRatingGuide")
    private String ageRatingGuide;
    @SerializedName("ageRating")
    private String ageRating;

    public Titles titles;

    public PosterImage posterImage;

    private CoverImage coverImage;

    public RatingFrequencies ratingFrequencies;



    public String getSynopsis() {
        return synopsis;
    }

    public String getCanonicalTitle() {
        return canonicalTitle;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getEpisodeCount() {
        return episodeCount;
    }

    public String getEpisodeLength() {
        return episodeLength;
    }

    public String getYoutubeVideoId() {
        return youtubeVideoId;
    }

    public String getAgeRatingGuide() {
        return ageRatingGuide;
    }

    public Titles getTitles() {
        return titles;
    }

    public CoverImage getCoverImage() {
        return coverImage;
    }

    public PosterImage getPosterImage() {
        return posterImage;
    }

    public void setAgeRatingGuide(String ageRatingGuide) {
        this.ageRatingGuide = ageRatingGuide;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public void setCanonicalTitle(String canonicalTitle) {
        this.canonicalTitle = canonicalTitle;
    }

    public void setCoverImage(CoverImage coverImage) {
        this.coverImage = coverImage;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setEpisodeCount(String episodeCount) {
        this.episodeCount = episodeCount;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public void setYoutubeVideoId(String youtubeVideoId) {
        this.youtubeVideoId = youtubeVideoId;
    }

    public void setPosterImage(PosterImage posterImage) {
        this.posterImage = posterImage;
    }

    public RatingFrequencies getRatingFrequencies () {return  ratingFrequencies;}


    public String getAgeRating() {
        return ageRating;
    }
}
