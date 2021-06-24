package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH = 3300;

    Animation topAnim,bottomAnim;
    ImageView imageview;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Below line is for removing the status bar
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        imageview = findViewById(R.id.imageView);
        textview = findViewById(R.id.text);

        //Text view will go upward and image view will come downward
        imageview.setAnimation(topAnim);
        textview.setAnimation(bottomAnim);

        //Till above animation is over and we will go to next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                //After finish we will not have option to come back
                finish();
            }
        },SPLASH);

    }
}