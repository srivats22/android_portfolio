package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    private MaterialCardView instaCard;
    private MaterialCardView linkedinCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instaCard = findViewById(R.id.instaCard);
        linkedinCard = findViewById(R.id.linkedinCard);

        instaCard.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), Profile.class);
            i.putExtra("url", "https://www.instagram.com/srivats22/");
            startActivity(i);
        });

        linkedinCard.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), Profile.class);
            i.putExtra("url", "http://linkedin.com/in/srivatsvenk");
            startActivity(i);
        });
    }
}