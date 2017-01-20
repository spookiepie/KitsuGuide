package ua.example.pie.animesearch.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HalfLaptop on 23.12.2016.
 */

public class Links  {
    @SerializedName("self")
    private String self;
    @SerializedName("related")
    private String related;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

}
