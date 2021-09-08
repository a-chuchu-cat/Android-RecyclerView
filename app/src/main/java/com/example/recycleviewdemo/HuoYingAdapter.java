package com.example.recycleviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HuoYingAdapter extends RecyclerView.Adapter<HuoYingAdapter.HuoYingViewHolder>{
    private List<Huoying> huoyingList;

    public HuoYingAdapter(List<Huoying> huoyingList){
        this.huoyingList=huoyingList;
    }

    @NonNull
    @Override
    public HuoYingAdapter.HuoYingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new HuoYingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HuoYingAdapter.HuoYingViewHolder holder, int position) {
        holder.tv_name.setText(huoyingList.get(position).getName());
        holder.tv_number.setText(String.valueOf(huoyingList.get(position).getNumber()));
        holder.tv_trump.setText(huoyingList.get(position).getTrump());
    }

    @Override
    public int getItemCount() {
        return huoyingList.size();
    }

    public static class HuoYingViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name,tv_number,tv_trump;

        public HuoYingViewHolder(View view){
            super(view);

            tv_name=view.findViewById(R.id.tv_name);
            tv_number=view.findViewById(R.id.tv_number);
            tv_trump=view.findViewById(R.id.tv_trump);
        }
    }
}
