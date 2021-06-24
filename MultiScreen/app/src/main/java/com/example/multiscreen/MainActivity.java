 package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.example.multiscreen.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //on clicking place order it will call the following function i.e., placeOrder and do the following task
    public void placeOrder(View view)
    {
        //Intent : It is used to bind other type of components in one i.e communication between the components
        //and for going from one activity(one screen) to another activity(another screen) we have to use intent
        //build in intent to open another activity
        Intent intent = new Intent(this, OrderActivity.class);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        String message = "Order for " + editText1.getText().toString() + ", "
                + editText2.getText().toString() + " & "
                + editText3.getText().toString() + " has been successfully placed";
        intent.putExtra(MSG, message);
        //after calling this line 
        startActivity(intent);
    }
}