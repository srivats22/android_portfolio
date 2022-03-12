package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {
    private MaterialCardView instaCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instaCard = findViewById(R.id.instaCard);

        // ToDo: change like 22 to be https://www.instagram.com/your_instagram_handle
        instaCard.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), Profile.class);
            i.putExtra("url", "https://www.instagram.com/srivats22/");
            startActivity(i);
        });
    }
}