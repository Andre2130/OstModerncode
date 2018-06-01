package com.example.mcs.ostmoderncode;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Show> shows;

    public RecyclerAdapter(List<Show> shows){
        this.shows = shows;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new MyViewHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Show show = shows.get(position);
        holder.bind(show);
    }

    @Override
    public int getItemCount() {
        return shows.size();
    }

    public void updateResponse(List<Show> shows) {
        this.shows = shows;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Title, imageUrl;

        public MyViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.row_item, parent, false));
            Title = (TextView)itemView.findViewById(R.id.title);
            imageUrl = (TextView)itemView.findViewById(R.id.imageUrl);
        }

        public void bind(Show show) {
            Title.setText(show.getTitle());
            imageUrl.setText(show.getUid());
        }
    }
}
