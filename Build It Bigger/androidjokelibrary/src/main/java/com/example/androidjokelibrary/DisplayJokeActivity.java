package com.example.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        jokeTextView = findViewById(R.id.joke_text);
        Intent intent = getIntent();
        if(intent != null && intent.hasExtra("joke")){
            String jokeText = intent.getStringExtra("joke");
            jokeTextView.setText(jokeText);
        }
    }
}
