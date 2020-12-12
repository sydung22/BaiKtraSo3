package com.example.thecoffeehouse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class orderAdapter extends RecyclerView.Adapter<orderAdapter.orderViewholder>{
        Context context207;
        int row_layout207;
        List<orderItem> itemList207;

        public orderAdapter(Context context, List<orderItem> itemList,int row_layout) {
            this.context207 = context;
            this.itemList207 = itemList;
            this.row_layout207=row_layout;
        }

    @NonNull
    @Override
    public orderViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView =layoutInflater.inflate(row_layout207,parent,false);
        return new orderViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull orderViewholder holder, int position) {
        holder.image.setImageResource(itemList207.get(position).getImage());
        holder.title.setText(itemList207.get(position).getTitle());
        holder.price.setText(itemList207.get(position).getPrice());

    }

    @Override
    public int getItemCount() {
        return itemList207.size();
    }

    public static final class orderViewholder extends RecyclerView.ViewHolder  {

            ImageView image;
            TextView title,price;

            public orderViewholder(@NonNull View itemView) {
                super(itemView);
                image=itemView.findViewById(R.id.image);
                title=itemView.findViewById(R.id.title);
                price=itemView.findViewById(R.id.price);
            }
        }
    }

