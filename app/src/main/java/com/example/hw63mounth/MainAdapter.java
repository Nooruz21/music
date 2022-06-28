package com.example.hw63mounth;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw63mounth.databinding.ItemNameBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter <MainAdapter.MainViewHolder> {

    private ArrayList<Model> data;
    private OnClick onClick;

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(ItemNameBinding.inflate(LayoutInflater.from(parent.getContext())) , parent , false);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    public MainAdapter(ArrayList<Model> data, OnClick onClick) {
        this.data = data;
        this.onClick = onClick;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class MainViewHolder extends RecyclerView.ViewHolder{

        private ItemNameBinding binding;

        public MainViewHolder(@NonNull ItemNameBinding itemView, ViewGroup parent, boolean b) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Model model) {
            binding.tvName.setText(model.getName());
            binding.tvText2.setText(model.getText2());
            binding.tvText1.setText(model.getText1());
            binding.tvTime.setText(model.getTime());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClick.ocClick(data.get(getAdapterPosition()));

                }
            });
        }
    }
}
