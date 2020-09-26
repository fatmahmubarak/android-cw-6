package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie y = new Movie("الاميره والوحش","الاميره",4.5,5,"عائلي");
        Movie t = new Movie("فروزن","ايلسا",5.0,8,"عائلي");
    }
}