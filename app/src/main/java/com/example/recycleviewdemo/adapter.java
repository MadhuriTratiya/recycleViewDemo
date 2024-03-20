package com.example.recycleviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<myviewholder> {

    Context context;
    List<itemc> itemcs;

    public adapter(Context context, List<itemc> itemcs) {
        this.context = context;
        this.itemcs = itemcs;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(LayoutInflater.from(context).inflate(R.layout.itemview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.nameview.setText(itemcs.get(position).getName());
        holder.emailview.setText(itemcs.get(position).getEmail());
        holder.imageView.setImageResource(itemcs.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return itemcs.size();
    }
}