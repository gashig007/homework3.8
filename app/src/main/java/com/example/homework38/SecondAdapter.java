package com.example.homework38;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework38.databinding.ItemSecondBinding;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter <SecondAdapter.SecondViewHolder> {
    private ArrayList<SecondModel> data;

    public SecondAdapter(ArrayList<SecondModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondViewHolder(ItemSecondBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondViewHolder holder, int position) {
holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class SecondViewHolder extends RecyclerView.ViewHolder{
        private ItemSecondBinding binding;

        public SecondViewHolder(@NonNull ItemSecondBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }

        public void bind(SecondModel secondModel) {
            binding.text1.setText(secondModel.getText1());
            binding.text2.setText(secondModel.getText2());
        }
    }
}
