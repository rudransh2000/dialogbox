package com.example.dialogbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recview;
    myadapter adapter;
    int []arr={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,
            R.drawable.nine,R.drawable.ten,R.drawable.eleven,R.drawable.twelve};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recview=findViewById(R.id.recview);
        recview.setLayoutManager(new GridLayoutManager(MainActivity2.this,2));
        adapter=new myadapter(arr);
        recview.setAdapter(adapter);
    }
}