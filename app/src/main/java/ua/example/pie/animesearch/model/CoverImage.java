package ua.example.pie.animesearch.model;

/**
 * Created by HalfLaptop on 23.12.2016.
 */

public class CoverImage
{
    private String original;

    private String small;

    private String large;

    public CoverImage (){}


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
}