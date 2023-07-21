package com.example.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txtTitle);
        editText = findViewById(R.id.edtEntername);
        btn = findViewById(R.id.btnSignIn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editText.getText().toString();

                // Explicit Intent.
                Intent intent = new Intent(getApplicationContext(), LuckyNumberActivity.class);

                //Passing the name to second activity
                intent.putExtra("name", username);

                startActivity(intent);
            }
        });


    }
}