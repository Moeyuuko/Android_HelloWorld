package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button button_finish_10;
    private Button button19;
    private Button button20;
    private ProgressBar progressBar;
    private TextView textView19;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        button_finish_10 = (Button)findViewById(R.id.button_finish_10);
        button_finish_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        button19 = (Button)findViewById(R.id.button19); //-
        button20 = (Button)findViewById(R.id.button20); //+
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        textView19 = (TextView)findViewById(R.id.textView19);

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<=0){
                    i=0;
                }else {
                    i=i-10;
                }
                progressBar.setProgress(i);
                textView19.setText(String.valueOf(i)+"%");
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i>=100){
                    i=100;
                }else {
                    i=i+10;
                }
                progressBar.setProgress(i);
                textView19.setText(String.valueOf(i)+"%");
            }
        });
    }

}