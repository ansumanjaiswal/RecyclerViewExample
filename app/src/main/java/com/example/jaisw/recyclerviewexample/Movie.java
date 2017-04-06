package com.example.jaisw.recyclerviewexample;

/**
 * Created by jaisw on 4/5/2017.
 */

public class Movie {

    String rank;
    String title;
    String distributor;
    String worldWideGross;

    public Movie(String rank, String title, String distributor, String worldWideGross) {
        this.rank = rank;
        this.title = title;
        this.distributor = distributor;
        this.worldWideGross = worldWideGross;
    }

    public String getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getWorldWideGross() {
        return worldWideGross;
    }
}
