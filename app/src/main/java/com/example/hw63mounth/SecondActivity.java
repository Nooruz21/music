package com.example.hw63mounth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.hw63mounth.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String text = getIntent().getStringExtra("key");
        binding.tvTextLOL.setText(text);

        if (findViewById(R.id.tv_textLOL) instanceof TextView) {
            ((TextView) findViewById(R.id.tv_textLOL)).setText(text);
        }

    }
}