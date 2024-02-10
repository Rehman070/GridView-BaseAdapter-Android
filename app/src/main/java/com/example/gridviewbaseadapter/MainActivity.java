package com.example.gridviewbaseadapter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    int[] images = {R.drawable.city2,R.drawable.city3,R.drawable.city4,R.drawable.city5,R.drawable.city6,R.drawable.city7,R.drawable.city8,R.drawable.city2,R.drawable.city3,R.drawable.city4,R.drawable.city5,R.drawable.city6,R.drawable.city7,R.drawable.city8,R.drawable.city2,R.drawable.city3,R.drawable.city4,R.drawable.city5,R.drawable.city6,R.drawable.city7,R.drawable.city8,R.drawable.city2,R.drawable.city3,R.drawable.city4,R.drawable.city5,R.drawable.city6,R.drawable.city7,R.drawable.city8,R.drawable.city2,R.drawable.city3,R.drawable.city4,R.drawable.city5,R.drawable.city6,R.drawable.city7,R.drawable.city8,R.drawable.city2,R.drawable.city3,R.drawable.city4,R.drawable.city5,R.drawable.city6,R.drawable.city7,R.drawable.city8,R.drawable.city2,R.drawable.city3,R.drawable.city4,R.drawable.city5,R.drawable.city6,R.drawable.city7,R.drawable.city8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);
        GridvVew_BaseAdapter myadapter = new GridvVew_BaseAdapter(getApplicationContext(),images);
        gridView.setAdapter(myadapter);

    }
}