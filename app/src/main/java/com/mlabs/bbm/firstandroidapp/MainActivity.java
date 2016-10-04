package com.mlabs.bbm.firstandroidapp;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button onTouch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onTouch1 = (Button) findViewById(R.id.btnOnTouch);

    }

    public void onTouch(View v) {

        Intent intent = new Intent(MainActivity.this, OnTouchActivity.class);
        startActivity(intent);

    }
    public void onTouchExam(View v) {

        Intent intent = new Intent(MainActivity.this, OnTouchExam.class);
        startActivity(intent);

    }
}

