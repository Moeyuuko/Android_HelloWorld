package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private List<View> views;
    private MyNewAdapter myNewAdapter; //重写 继承 ViewPagerAdapter
    private Button button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.ViewPager_1);
        views = new ArrayList<View>();
        LayoutInflater inflater = LayoutInflater.from(getApplicationContext());

        View view1 = inflater.inflate(R.layout.activity_view_pager_1, null);
        View view2 = inflater.inflate(R.layout.activity_view_pager_2, null);
        View view3 = inflater.inflate(R.layout.activity_view_pager_3, null);
        views.add(view1);
        views.add(view2);
        views.add(view3);

        myNewAdapter = new MyNewAdapter(views);
        viewPager.setAdapter(myNewAdapter);

        button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
