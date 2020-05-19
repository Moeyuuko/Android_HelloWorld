package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button;        //声明变量
    private Button button2;
    private Button button4;
    private Button button7;
    private Button button9;
    private Button button10;
    private Button button14;

    private TextView textView;
    private TextView textView2;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button); //绑定组件
        button2 = (Button)findViewById(R.id.button2);
        button4 = (Button)findViewById(R.id.button4);
        button7 = (Button)findViewById(R.id.button7);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button14 = (Button)findViewById(R.id.button14);

        textView = (TextView) findViewById(R.id.textView);//绑定组件
        final String[] data={"Hello world!","你好世界!","こんにちは世界！","안녕하세요 세상!",
                                            "Hallo Welt!","Привет, мир!","สวัสดีโลก","(๑＞ڡ＜)☆"};
                                            //字符串数组

        i=1;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("变量i", String.valueOf(i));   //日志输出-检查变量
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
                Log.i("新建窗口", "Main2Activity");
                Intent intent=new Intent(MainActivity.this,Main2Activity.class); //新建意图

                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("新建窗口", "Main3Activity");
                Intent intent=new Intent(MainActivity.this,Main3Activity.class); //新建意图

                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("新建窗口", "Main4Activity");
                Intent intent=new Intent(MainActivity.this,Main4Activity.class); //新建意图

                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("新建窗口", "ViewPagerActivity");
                Intent intent=new Intent(MainActivity.this,ViewPagerActivity.class); //新建意图

                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("新建窗口", "random");
                Intent intent=new Intent(MainActivity.this,Main6Activity.class); //新建意图

                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("新建窗口", "剪刀石头布");
                Intent intent=new Intent(MainActivity.this,Main7Activity.class); //新建意图

                startActivity(intent);
            }
        });

        textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"+1S",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
