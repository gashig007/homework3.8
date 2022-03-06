package com.example.homework38;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework38.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
private FragmentSecondBinding binding;
private ArrayList<SecondModel> data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        SecondAdapter secondAdapter = new SecondAdapter(data);
        binding.recyclerSecond.setAdapter(secondAdapter);

    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new SecondModel("Planet", "Earth (C-137)"));
        data.add(new SecondModel("Cluster", "Abadango"));
        data.add(new SecondModel("Space station", "Citadel of Ricks"));
        data.add(new SecondModel("Planet", "Worldender`s lair"));
        data.add(new SecondModel("Microverse", "Anatomy Park"));
        data.add(new SecondModel("TV", "Interdimensional Cable"));
        data.add(new SecondModel("Resort", "Immortality Field Resort"));
        data.add(new SecondModel("Planet", "Post-Apocalyptic Earth"));
        data.add(new SecondModel("Planet", "Purge Planet"));
        data.add(new SecondModel("Planet", "Venzenulon 7"));
        data.add(new SecondModel("Planet", "Bepis 9"));
        data.add(new SecondModel("Planet", "Cronenberg Earth"));
        data.add(new SecondModel("Planet", "Nuptia 4"));
        data.add(new SecondModel("Fantasy town", "Giant`s Town"));
        data.add(new SecondModel("Planet", "Bird World"));
        data.add(new SecondModel("Space station", "St. Gloopy Noops Hospital"));
        data.add(new SecondModel("Planet", "Earth (5-126)"));
        data.add(new SecondModel("Dream", "Mr. Goldenfold`s dream"));
        data.add(new SecondModel("Planet", "Gromflom Prime"));
        data.add(new SecondModel("Planet", "Earth (Rpl. Dimension)"));
    }
}