package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {
    private Button button_finish;
    private Button button8;
    private Button button_clearFocus;
    private EditText PutExtra_TextData;
    private EditText Bundle_TextData;
    private String PutExtra_TextData_default_str;
    private String Bundle_TextData_default_str;

    protected void hideInput() {   //隐藏键盘
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);//输入法管理器imm
        View v = getWindow().peekDecorView();
        if (null != v) {
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        PutExtra_TextData = (EditText)findViewById(R.id.editText_putExtra);
        PutExtra_TextData_default_str = PutExtra_TextData.getText().toString(); //获取默认内容
        PutExtra_TextData.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    // 此处为得到焦点时的处理内容
                    if (PutExtra_TextData.getText().toString().equals(PutExtra_TextData_default_str)) {
                        PutExtra_TextData.setText(""); //清除
                    }
                } else {
                    // 此处为失去焦点时的处理内容
                    if (PutExtra_TextData.getText().length()==0) {
                        PutExtra_TextData.setText(PutExtra_TextData_default_str);
                    }
                }
            }
        });

        Bundle_TextData = (EditText)findViewById(R.id.editText_Bundle);
        Bundle_TextData_default_str = Bundle_TextData.getText().toString(); //获取默认内容
        Bundle_TextData.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    // 此处为得到焦点时的处理内容
                    if (Bundle_TextData.getText().toString().equals(Bundle_TextData_default_str)) {
                        Bundle_TextData.setText(""); //清除
                    }
                } else {
                    // 此处为失去焦点时的处理内容
                    if (Bundle_TextData.getText().length()==0) {
                        Bundle_TextData.setText(Bundle_TextData_default_str);
                    }
                }
            }
        });

        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle_TextData.clearFocus();
                PutExtra_TextData.clearFocus();
                hideInput();

                Intent intent=new Intent(Main4Activity.this,Main5Activity.class);
                //putExtra//
                intent.putExtra("PutExtra_Data",PutExtra_TextData.getText().toString());
                //Bundle//
                Bundle bundle = new Bundle();
                bundle.putString("Bundle_Data",Bundle_TextData.getText().toString());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        button_clearFocus = (Button)findViewById(R.id.button_clearFocus);
        button_clearFocus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle_TextData.clearFocus();
                PutExtra_TextData.clearFocus();
                hideInput();
            }
        });

        button_finish = (Button)findViewById(R.id.button_finish);
        button_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
