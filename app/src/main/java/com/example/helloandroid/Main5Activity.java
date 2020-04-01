package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    private TextView PutExtra_textView_get;
    private TextView Bundle_textView_get;
    private Button Button_re;
    private EditText EditText_re;
    private String EditText_re_default_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //===获取===//
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


        //===返回===//
        EditText_re = (EditText)findViewById(R.id.EditText_re);
        EditText_re_default_str = EditText_re.getText().toString();
        EditText_re.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    if (EditText_re.getText().toString().equals(EditText_re_default_str)) {
                        EditText_re.setText(""); //清除
                    }
                } else {
                    if (EditText_re.getText().length()==0) {
                        EditText_re.setText(EditText_re_default_str);
                    }
                }
            }
        });

        Button_re = (Button)findViewById(R.id.Button_re);

        Button_re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText_re.clearFocus();
                Intent intent = new Intent();
                intent.putExtra("ExtraData",EditText_re.getText().toString());
                setResult(1,intent);
                finish();
            }
        });

    }
}
