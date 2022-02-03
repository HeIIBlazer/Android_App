package com.example.a3screensapc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button backButton;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        backButton = (Button) findViewById(R.id.knopka2);
        nextButton = (Button) findViewById(R.id.knopka3);
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        Intent intent2 = new Intent(MainActivity2.this, MainActivity3.class);

        backButton.setOnClickListener(v -> {
            startActivity(intent);
        });
        nextButton.setOnClickListener(v -> {
            startActivity(intent2);
        });
    }
}