package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main9Activity extends AppCompatActivity {
    private TextView textView18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        textView18 = (TextView)findViewById(R.id.textView18);

        int[] data={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};//数据

        //输出数据看看
        textView18.setText(textView18.getText()+"Go ");
        for (int data_i=1;data_i<data.length;data_i++){
            textView18.setText(textView18.getText()+""+String.valueOf(data[data_i])+",");
            Log.i("data", String.valueOf(data[data_i])+",");
        }
        textView18.setText(textView18.getText()+"\n\n");


        //冒泡开始
        int i,j;
        for (i = data.length;i>1;i--){
            //textView18.setText(textView18.getText()+"\n"+"i>1");
            Log.i("i", String.valueOf(i));
            for (j=1;j<i;j++){
                Log.i("j", String.valueOf(j));
                if(j+1<i) {
                    if (data[j] < data[j + 1]) {
                        int tmp = data[j];
                        data[j] = data[j + 1];  //交换
                        data[j + 1] = tmp;
                    }
                }
            }

            for (int data_i=1;data_i<data.length;data_i++){
                textView18.setText(textView18.getText()+""+String.valueOf(data[data_i])+",");
            }
            textView18.setText(textView18.getText()+"\n");
        }
        //冒泡结束

        textView18.setText(textView18.getText()+"\nOK ");
        for (int data_i=1;data_i<data.length;data_i++){
            textView18.setText(textView18.getText()+""+String.valueOf(data[data_i])+",");
        }
        textView18.setText(textView18.getText()+"\n");
    }
}
