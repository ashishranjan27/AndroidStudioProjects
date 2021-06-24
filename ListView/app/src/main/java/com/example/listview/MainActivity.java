package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] cities = {"Mumbai","bangkok","London","paris","Dubai","Singapore","New york","Tokyo","Delhi","Ranchi","Jaipur","Guragon"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                                                            
        list = findViewById(R.id.list_id);

        //Adapter is like it pick the data from data source(like database , array list or simple array) and place it in a view like list view.
        //three parameter first is current parameter where your activity is currently located,second is layout here we take inbuilt layout but in recycler view we made of our own
        // and third one is data source
        //Second parameter is inbuilt activity in android studio

        //Array
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,cities);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this , "Clicked "+ cities[position] , Toast.LENGTH_SHORT).show();
                Log.d("MainActivity","Ashish");
            }
        });





    }

}