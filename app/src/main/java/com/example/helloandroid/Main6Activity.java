package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main6Activity extends AppCompatActivity {
    private Button button_finish_6;
    private Button button_random;
    private Random random;
    private EditText editText_Min;
    private EditText editText_Max;
    private TextView textView_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        editText_Min = (EditText)findViewById(R.id.editText_Min);
        editText_Max = (EditText)findViewById(R.id.editText_Max);
        textView_result = (TextView)findViewById(R.id.textView_result);

        button_random =(Button)findViewById(R.id.button_random);
        button_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Min=0,Max=0;

                if (editText_Max.length()==0 && editText_Min.length()==0){
                    Toast.makeText(Main6Activity.this, "输入内容啊", Toast.LENGTH_SHORT).show();
                }
                else if (editText_Max.length()==0){
                    Toast.makeText(Main6Activity.this, "最大值 不可空", Toast.LENGTH_SHORT).show();
                }
                else if (editText_Min.length()==0){
                    Toast.makeText(Main6Activity.this, "最小值 不可空", Toast.LENGTH_SHORT).show();
                }
                else {
                    Min = Integer.parseInt(editText_Min.getText().toString());
                    Log.i("Min", String.valueOf(Min));
                    Max = Integer.parseInt(editText_Max.getText().toString());
                    Log.i("Max", String.valueOf(Max));
                    if (Min > Max) {
                        Toast.makeText(Main6Activity.this, "最小值 不要大于 最大值", Toast.LENGTH_SHORT).show();
                    } else if (Min == Max) {
                        Toast.makeText(Main6Activity.this, "最小值 最大值 不可相同", Toast.LENGTH_SHORT).show();
                    } else {
                        int last = Max - Min;
                        Log.i("last", String.valueOf(last));

                        Random radom = new Random();
                        int radom_out = radom.nextInt(last + 1);
                        Log.i("radom_out", String.valueOf(radom_out));

                        int result = radom_out + Min;
                        Log.i("result", String.valueOf(result));

                        textView_result.setText(String.valueOf(result));
                        Log.i("=====", "=====");

                    }
                }

            }
        });

        button_finish_6 = (Button)findViewById(R.id.button_finish_6);
        button_finish_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
