package com.example.hw63mounth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw63mounth.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
         setContentView(binding.getRoot());
         getSupportFragmentManager().beginTransaction().add(R.id.container_main , new MainFragment()).commit();
         getSupportFragmentManager().beginTransaction().add(R.id.container_second , new SecondFragment()).commit();
    }
}