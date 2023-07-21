package com.example.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

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

        //userName Data
        Intent intent = getIntent();
        String userName = intent.getStringExtra("name");

        //Random Number Generator
        int random = generateRandomNum();

        luckyNumberTxt.setText("" + random);

    }

    public int generateRandomNum() {
        Random random = new Random();
        int upper = 1000;
        int randomNumberGenerated = random.nextInt(upper);
        return randomNumberGenerated;
    }
}