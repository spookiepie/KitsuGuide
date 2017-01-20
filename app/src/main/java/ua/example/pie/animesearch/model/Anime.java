package ua.example.pie.animesearch.model;

import com.google.gson.annotations.SerializedName;


public class Anime  {


    @SerializedName("id")
    private String id;
    @SerializedName("type")
    private String type;

    public  Attributes attributes;

    public  PosterImage posterImage;

    public Links links;



    public String getTitle(){

        return attributes.getCanonicalTitle();
    }


    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getType() { return type;}

    public void setType(String type) { this.type = type;}

    public Attributes getAttributes() {
        return attributes;
    }

    public PosterImage getPosterImage (){return posterImage;}

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public void setPosterImage(PosterImage posterImage) {
        this.posterImage = posterImage;
    }
}




