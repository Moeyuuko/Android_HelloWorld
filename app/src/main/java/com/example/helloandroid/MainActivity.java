package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button;        //声明变量
    private Button button2;

    private TextView textView;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button); //绑定组件
        button2 = (Button)findViewById(R.id.button2);

        textView = (TextView) findViewById(R.id.textView);//绑定组件
        final String[] data={"Hello world!","你好世界!","こんにちは世界！","안녕하세요 세상!",
                                            "Hallo Welt!","Привет, мир!","สวัสดีโลก","(๑＞ڡ＜)☆"};
                                            //字符串数组

        i=1;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("变量i=", String.valueOf(i));   //日志输出-检查变量
                textView.setText(data[i]);                //操作textView
                if (i==data.length-1){                    //和数组变量相同就归零 不然数组超出 软件会崩溃
                    i=0;
                }else {
                    i=i+1;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("新建窗口=", "ok");
                Intent intent=new Intent(MainActivity.this,Main2Activity.class); //新建意图

                startActivity(intent);
            }
        });
    }

}
