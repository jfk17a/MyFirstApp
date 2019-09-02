package com.example.mytestapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello " + message);
        TextView personalMessage = findViewById(R.id.personalMessage);
        personalMessage.setText("My name is Joshua Kersker, and I am not like most people. What do I mean by this? Well I am a Christian Ministry Major in Abilene Texas who is from Valparaiso Indiana. I have always been a nerd who likes to mess with computers in my free time, however, doing so also can be boring when that was the only thing that I did. I needed something else with it, and I felt a calling to ministry. As a result, I am here! If there is a problem with that, I understand. Ministry and computers are very different, however, I believe that there are many practical applications for both, and they do overlap. I will find many ways, and I know that God will use me for them.");
    }
}
