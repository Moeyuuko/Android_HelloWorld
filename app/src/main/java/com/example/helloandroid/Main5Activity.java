package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    private TextView PutExtra_textView_get;
    private TextView Bundle_textView_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        PutExtra_textView_get = (TextView)findViewById(R.id.PutExtra_textView_get);
        Bundle_textView_get = (TextView)findViewById(R.id.Bundle_textView_get);
        
        //PutExtra//
        Intent intent = getIntent();
        String PutExtra_Data = intent.getStringExtra("PutExtra_Data");
        PutExtra_textView_get.setText(PutExtra_Data);
        //Bundle//
        Bundle bundle = getIntent().getExtras();
        String Bundle_Data = bundle.getString("Bundle_Data");
        Bundle_textView_get.setText(Bundle_Data);

    }
}
