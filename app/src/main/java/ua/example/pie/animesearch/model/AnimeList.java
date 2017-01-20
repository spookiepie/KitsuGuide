package ua.example.pie.animesearch.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;



public class AnimeList  {

    @SerializedName("data")
    private List<Anime> data;
    @SerializedName("first")
    private String first;
    @SerializedName("next")
    private String next;
    @SerializedName("last")
    private String last;




    public List<Anime> getResults(){
        return data;
    }

    public void setResults(List<Anime> data) {
        this.data = data;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}


