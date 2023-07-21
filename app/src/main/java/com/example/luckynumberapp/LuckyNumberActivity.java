package com.example.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(userName, random);
            }
        });

    }

    public int generateRandomNum() {
        Random random = new Random();
        int upper = 1000;
        int randomNumberGenerated = random.nextInt(upper);
        return randomNumberGenerated;
    }

    public void shareData(String username, int random){
        //implicit Intents
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_SUBJECT, username);
        intent.putExtra(Intent.EXTRA_TEXT, random);

        startActivity(Intent.createChooser(intent, "Choose a platform"));
    }
}