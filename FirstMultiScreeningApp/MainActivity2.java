package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.multiscreenapp.R.id.textView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        textView.setText("Hello, "+ name+". Have a nice day!");
    }
}
