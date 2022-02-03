package com.example.a3screensapc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button nextButton;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        backButton = (Button) findViewById(R.id.knopka4);
        nextButton = (Button) findViewById(R.id.knopka5);
        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
        Intent intent2 = new Intent(MainActivity3.this, MainActivity4.class);

        backButton.setOnClickListener (v -> {
            startActivity(intent);
        });
        nextButton.setOnClickListener(v -> {
            startActivity(intent2);
        });
    }
}