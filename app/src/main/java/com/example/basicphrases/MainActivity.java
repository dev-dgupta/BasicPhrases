package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPhrase(View view) {
        Button buttonPressed = (Button) view;
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(buttonPressed.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();
    }
}