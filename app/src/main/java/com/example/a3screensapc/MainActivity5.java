package com.example.a3screensapc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button nextButton;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        backButton = (Button) findViewById(R.id.knopka8);
        nextButton = (Button) findViewById(R.id.knopka9);
        Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
        Intent intent2 = new Intent(MainActivity5.this, MainActivity.class);

        backButton.setOnClickListener (v -> {
            startActivity(intent);
        });
        nextButton.setOnClickListener(v -> {
            startActivity(intent2);
        });
    }
}