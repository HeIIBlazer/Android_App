package com.example.a3screensapc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextButton = (Button) findViewById(R.id.knopka1);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);

        nextButton.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}