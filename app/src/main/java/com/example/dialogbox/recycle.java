package com.example.dialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class recycle extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        txt=findViewById(R.id.txt);
        String val1=getIntent().getStringExtra("Val");
        txt.setText(val1);
    }
}