package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMovies(View view) {
        Toast.makeText(this, "This button will launch Popular Movies app!", Toast.LENGTH_SHORT).show();
    }

    public void stockHawk(View view) {
        Toast.makeText(this, "This button will launch Stock Hawk app!", Toast.LENGTH_SHORT).show();
    }

    public void buildItBigger(View view) {
        Toast.makeText(this, "This button will launch Build It Bigger app!", Toast.LENGTH_SHORT).show();
    }

    public void makeYourAppMaterial(View view) {
        Toast.makeText(this, "This button will launch Make Your App Material app!", Toast.LENGTH_SHORT).show();
    }

    public void goUbi(View view) {
        Toast.makeText(this, "This button will launch Go Ubiquitous app!", Toast.LENGTH_SHORT).show();
    }

    public void capstone(View view) {
        Toast.makeText(this, "This button will launch Capstone app!", Toast.LENGTH_SHORT).show();
    }
}
