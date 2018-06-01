package com.example.mcs.ostmoderncode;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ShowList {

    @SerializedName("objects")
    private List<Show> shows;

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}