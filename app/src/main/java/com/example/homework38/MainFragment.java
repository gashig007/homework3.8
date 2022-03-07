package com.example.homework38;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework38.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment implements OnClick {
private FragmentMainBinding binding;
private ArrayList <FirstModel> data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        MainAdapter adapter = new MainAdapter(this, data);
        binding.recycler.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new FirstModel(R.drawable.ic_image1, "Alive", "Rick Sanchez"));
        data.add(new FirstModel(R.drawable.ic_image2, "Alive", "Morty Smith"));
        data.add(new FirstModel(R.drawable.ic_image3, "Dead", "Albert Einstein"));
        data.add(new FirstModel(R.drawable.ic_image4, "Alive", "Jerry Smith"));
    }

    @Override
    public void OnClick(FirstModel firstModel) {
       NavHostFragment.findNavController(MainFragment.this).navigate(MainFragmentDirections.actionNavigationCharacterToNavigationCharacter1(firstModel));
    }
}