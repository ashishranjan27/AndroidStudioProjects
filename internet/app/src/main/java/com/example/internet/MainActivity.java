package com.example.internet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private Boolean wifiConnected = false;
     private Boolean mobileConnected = true;
     TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        boolean internet_status = checknetwork();

    }



    public boolean checknetwork(){
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.isConnected())
        {   //Log.d("Ashish" , "networkInfo.getType()");
            if(networkInfo.getType() == connectivityManager.TYPE_WIFI)
            {
                wifiConnected = true;
            }
            if(networkInfo.getType() == connectivityManager.TYPE_MOBILE)
            {
                mobileConnected = true;
            }

            if(wifiConnected)
            {
                textView.setText("Connected to wifi");
            }
            else if(mobileConnected)
            {
                textView.setText("connected to mobile");
            }
            return true;
        }
        else
        {
            textView.setText("Not connected");
            return false;
        }
    }
}