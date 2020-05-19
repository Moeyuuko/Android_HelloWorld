package com.example.helloandroid;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main7Activity extends AppCompatActivity {
    private Button button_finish_7;
    private RadioGroup radgroup;
    private RadioButton radbtn;
    private Button out;
    private Random random;
    private TextView wininfo;
    private TextView out_info;
    private String iii;//起名字真难 单选框信息

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Button out = (Button)findViewById(R.id.out_jdstb);
        final RadioGroup radgroup = (RadioGroup) findViewById(R.id.radgroup);

        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < radgroup.getChildCount(); i++) {
                    RadioButton rd = (RadioButton) radgroup.getChildAt(i);
                    if (rd.isChecked()) {
                        iii = String.valueOf(rd.getText());
                        break;
                    }
                }

                Random radom = new Random();
                int radom_out = radom.nextInt(3);

                Log.i("radom_out", String.valueOf(radom_out));// 0石头1剪刀2布
                Log.i("iii", String.valueOf(iii));

                TextView out_info = (TextView)findViewById(R.id.out_info);
                if (radom_out==0){ // 0石头
                    out_info.setText("石头");
                }else if(radom_out==1){ // 1剪刀
                    out_info.setText("剪刀");
                }else if(radom_out==2){ // 2布
                    out_info.setText("布");
                }

                TextView wininfo = (TextView)findViewById(R.id.wininfo);
                if (iii.equals("石头")){
                    wininfo.setText(iii);
                    if(radom_out==0){
                        wininfo.setTextColor(Color.YELLOW);
                        wininfo.setText("平手");
                    }
                    if(radom_out==1) {
                        wininfo.setTextColor(Color.GREEN);
                        wininfo.setText("你赢了");
                    }
                    if(radom_out==2) {
                        wininfo.setTextColor(Color.RED);
                        wininfo.setText("你输了");
                    }
                }

                if (iii.equals("剪刀")){
                    wininfo.setText(iii);
                    if(radom_out==0){
                        wininfo.setTextColor(Color.RED);
                        wininfo.setText("你输了");
                    }
                    if(radom_out==1) {
                        wininfo.setTextColor(Color.YELLOW);
                        wininfo.setText("平手");
                    }
                    if(radom_out==2) {
                        wininfo.setTextColor(Color.GREEN);
                        wininfo.setText("你赢了");
                    }
                }

                if (iii.equals("布")){
                    wininfo.setText(iii);
                    if(radom_out==0){
                        wininfo.setTextColor(Color.GREEN);
                        wininfo.setText("你赢了");
                    }
                    if(radom_out==1) {
                        wininfo.setTextColor(Color.RED);
                        wininfo.setText("你输了");
                    }
                    if(radom_out==2) {
                        wininfo.setTextColor(Color.YELLOW);
                        wininfo.setText("平手");
                    }
                }



            }
        });

        button_finish_7 = (Button)findViewById(R.id.button_finish_7);
        button_finish_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
