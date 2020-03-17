package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        final String[] data={"Hello world!","你好世界!","こんにちは世界！","안녕하세요 세상!",
                                            "Hallo Welt!","Привет, мир!","สวัสดีโลก","(๑＞ڡ＜)☆"};


        i=1;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(data[i]);
                if (i==data.length-1){
                    i=0;
                }else {
                    i=i+1;
                }
            }
        });

    }

}
