package com.example.opendialertest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn= findViewById<Button>(R.id.button)
        btn.setOnClickListener(View.OnClickListener {
            var intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567890"))
            startActivity(intent)
        })
    }
}