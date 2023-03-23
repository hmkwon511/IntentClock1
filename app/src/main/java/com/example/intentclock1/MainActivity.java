package com.example.intentclock1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clockButtonClicked(View view) {
        Intent it = new Intent(getApplicationContext(), ClockActivity.class);
        startActivity(it);
    }

    public void endButtonClicked(View view) {
        finish();
    }

}