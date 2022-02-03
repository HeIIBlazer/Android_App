package com.example.a3screensapc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Button nextButton;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        backButton = (Button) findViewById(R.id.knopka6);
        nextButton = (Button) findViewById(R.id.knopka7);
        Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
        Intent intent2 = new Intent(MainActivity4.this, MainActivity5.class);

        backButton.setOnClickListener (v -> {
            startActivity(intent);
        });
        nextButton.setOnClickListener(v -> {
            startActivity(intent2);
        });
    }
}