package com.example.braingames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    android.widget.ImageButton logoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoButton = (android.widget.ImageButton) findViewById(R.id.logoButton);
        logoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMinigamesPage();
            }
        });
    }

    public void openMinigamesPage(){
        android.content.Intent intent = new android.content.Intent(this, MinigamesPage.class);
        startActivity(intent);
    }
}