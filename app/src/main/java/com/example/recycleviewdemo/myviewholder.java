package com.example.recycleviewdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class myviewholder extends RecyclerView.ViewHolder {
ImageView imageView;
TextView nameview;
TextView emailview;
    public myviewholder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageview);
        nameview = itemView.findViewById(R.id.text);
        emailview = itemView.findViewById(R.id.email);
    }

}