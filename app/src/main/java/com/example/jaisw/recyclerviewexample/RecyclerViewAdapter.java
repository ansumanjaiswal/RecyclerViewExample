package com.example.jaisw.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/**
 * Created by jaisw on 4/5/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder> {
    List<Movie> movieList;

    public RecyclerViewAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.tvRank.setText(movie.getRank());
        holder.tvTitle.setText(movie.getTitle());
        holder.tvDistributor.setText(movie.getDistributor());
        holder.tvWorldwideGross.setText(movie.getWorldWideGross());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tvRank;
        TextView tvTitle;
        TextView tvDistributor;
        TextView tvWorldwideGross;
        public CustomViewHolder(View view) {
            super(view);
            tvRank = (TextView)view.findViewById(R.id.rank);
            tvTitle = (TextView)view.findViewById(R.id.title);
            tvDistributor = (TextView)view.findViewById(R.id.distributor);
            tvWorldwideGross = (TextView)view.findViewById(R.id.worldwideGross);
        }
    }
}
