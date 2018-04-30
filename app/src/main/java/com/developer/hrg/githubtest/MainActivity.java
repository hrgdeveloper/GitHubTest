package com.developer.hrg.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "hi there", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "another test", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "hi lay", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "bogh bogh", Toast.LENGTH_SHORT).show();
    }
}
