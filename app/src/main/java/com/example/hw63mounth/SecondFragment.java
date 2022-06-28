package com.example.hw63mounth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw63mounth.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnClick {

    private ArrayList<Model> data;
    private MainAdapter adapter;

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new MainAdapter(data, this);
        binding.recyclerMain.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model("1", "Blank Space", "3:55", "Taylor Swift"));
        data.add(new Model("2", "Watch me", "4:53", "Silento"));
        data.add(new Model("3", "Earn Id", "2:15", "The Weekend"));
        data.add(new Model("4", "The Hills", "9:55", "The Weekend"));
        data.add(new Model("5", "Blank Space", "6:55", "Taylor Swift"));
    }

    @Override
    public void ocClick(Model model) {
        Intent intent = new Intent(requireActivity(), SecondActivity.class);
        intent.putExtra("key", model.getName());
        startActivity(intent);
    }
}