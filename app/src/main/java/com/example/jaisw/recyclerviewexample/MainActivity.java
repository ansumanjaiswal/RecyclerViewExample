package com.example.jaisw.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createMovieList();
        RecyclerViewAdapter adapter =  new RecyclerViewAdapter(movieList);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void createMovieList(){
        Movie movie = new Movie("1", "Captain America : Civil War", "Disney", "$1,153,304,495");
        movieList.add(movie);

        movie = new Movie("2", "Rogue One: A Star Wars Story", "Disney", "$1,052,352,131");
        movieList.add(movie);

        movie = new Movie("3", "Finding Dory", "Disney", "$1,028,213,633");
        movieList.add(movie);

        movie = new Movie("4", "Zootopia", "Disney", "$1,023,784,195");
        movieList.add(movie);

        movie = new Movie("5", "The Jungle Book", "Disney", "$966,550,600");
        movieList.add(movie);

        movie = new Movie("6", "The Secret Life of Pets", "Universal", "$875,457,937");
        movieList.add(movie);

        movie = new Movie("7", "Batman v Superman: Dawn of Justice", "Warner Bros.", "$873,260,194");
        movieList.add(movie);

        movie = new Movie("8", "Fantastic Beast and Where to Find Them", "Warner Bros.", "$812,012,652");
        movieList.add(movie);

        movie = new Movie("9", "Deadpool", "20th Century Fox", "$783,112,979");
        movieList.add(movie);

        movie = new Movie("10", "Suicide Squad", "Warner Bros.", "$745,600,054");
        movieList.add(movie);
    }

}
