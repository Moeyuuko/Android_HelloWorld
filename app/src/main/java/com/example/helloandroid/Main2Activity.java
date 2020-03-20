package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button button3;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button3 = (Button)findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("方法调用","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("方法调用","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("方法调用","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("方法调用","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("方法调用","onDestroy()");
    }
}


