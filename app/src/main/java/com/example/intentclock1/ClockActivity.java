package com.example.intentclock1;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ClockActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clockactivity);
    }

    public void endButtonClicked(View view) {
        finish();
    }
}
//commit2 - 기능2구현
