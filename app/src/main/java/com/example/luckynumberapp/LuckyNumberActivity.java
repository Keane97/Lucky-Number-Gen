package com.example.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LuckyNumberActivity extends AppCompatActivity {

    TextView welcomeText, luckyNumberTxt;
    Button share_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);

        welcomeText = findViewById(R.id.txtTitle);
        luckyNumberTxt = findViewById(R.id.luckyNumbertext);
        share_btn = findViewById(R.id.share_number_btn);
    }
}