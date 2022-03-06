package com.example.homework38;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework38.databinding.ItemMainBinding;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
private OnClick onClick;
    private ArrayList<FirstModel> data;

    public MainAdapter(OnClick onClick, ArrayList<FirstModel> data) {
        this.onClick = onClick;
        this.data = data;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(ItemMainBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder {
        private ItemMainBinding binding;

        public MainViewHolder(@NonNull ItemMainBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(FirstModel model) {
            binding.image.setImageResource(model.getImage());
            binding.text.setText(model.getText());
            binding.name.setText(model.getName());

        }
    }
}
