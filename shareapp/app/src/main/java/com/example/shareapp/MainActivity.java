package com.example.shareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sharebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("text/plain");
                String shareBody = "Download this one :  https://play.google.com/store/apps/details?id=com.hwkrbbt.downloadall&hl=en_IN&gl=US";
                String sharesubject = "learning the share app";

                shareintent.putExtra(Intent.EXTRA_SUBJECT,sharesubject);
                shareintent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(shareintent,"Share Using"));

                //startActivity(shareintent);
            }
        });
    }
}