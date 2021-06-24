package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        VideoView song = findViewById(R.id.songs);
        song.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.song);
        MediaController mediaController = new MediaController(this);
        song.setMediaController(mediaController);
        song.start();

    }
}