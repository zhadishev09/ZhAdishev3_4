package com.temirlan.continentsandcountries.continentsandcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geektech.continentsandcountries.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ContinentFragment()).commit();
        }
    }
}