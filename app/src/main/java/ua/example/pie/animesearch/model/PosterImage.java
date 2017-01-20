package ua.example.pie.animesearch.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Pie on 25.12.2016.
 */

public class PosterImage
{
    @SerializedName("tiny")
    private String tiny;
    @SerializedName("original")
    private String original;
    @SerializedName("small")
    private String small;
    @SerializedName("large")
    private String large;
    @SerializedName("medium")
    private String medium;



    public String getTiny ()
    {
        return tiny;
    }

    public void setTiny (String tiny)
    {
        this.tiny = tiny;
    }

    public String getOriginal ()
    {
        return original;
    }

    public void setOriginal (String original)
    {
        this.original = original;
    }

    public String getSmall ()
    {
        return small;
    }

    public void setSmall (String small)
    {
        this.small = small;
    }

    public String getLarge ()
    {
        return large;
    }

    public void setLarge (String large)
    {
        this.large = large;
    }

    public String getMedium ()
    {
        return medium;
    }

    public void setMedium (String medium)
    {
        this.medium = medium;
    }
}