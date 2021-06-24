package com.example.deviceid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.PackageInfoCompat;

import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //to find the device id
         textView = findViewById(R.id.showDeviceId);
         String id = Settings.Secure.getString(this.getContentResolver(),Settings.Secure.ANDROID_ID);
         textView.setText(id);

         //to find the version code
         textView1=findViewById(R.id.showVersionCode);
         textView1.setText(String.valueOf(BuildConfig.VERSION_CODE));

         //display the version name to textview
         textView2= findViewById(R.id.showVersionName);
         textView2.setText(String.valueOf(BuildConfig.VERSION_NAME));







         //display the
         textView3 = findViewById(R.id.versionName);
         textView3.setText(String.valueOf(Build.VERSION.SDK_INT));
    }
}
