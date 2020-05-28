package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {
    private Button button_finish_8;
    private Button button_go_8;
    private TextView textView_Animator;
    private TextView textView12;
    private TextView textView15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        button_finish_8 = (Button)findViewById(R.id.button_finish_8);
        button_finish_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        button_go_8 = (Button)findViewById(R.id.button_go_8);

        button_go_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_Animator = (TextView)findViewById(R.id.textView_Animator);
                textView12 =  (TextView)findViewById(R.id.textView12);
                textView15 =  (TextView)findViewById(R.id.textView15);

                ValueAnimator valueAnimator = ValueAnimator.ofFloat(0f, 800f);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float deltaY = (float)valueAnimator.getAnimatedValue();
                        textView12.setText(String.valueOf(deltaY));
                        textView_Animator.setTranslationY(deltaY);
                        Log.i("deltaY",String.valueOf (deltaY));
                    }
                });
                //API Level 21
                if(Build.VERSION.SDK_INT >= 21) {
                    int startColor = 0xffff0000;//起始颜色
                    int endColor = 0xff00ff00; //终止颜色
                    ValueAnimator valueAnimator_rgb = ValueAnimator.ofArgb(startColor, endColor);
                    valueAnimator_rgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int color = (int)valueAnimator.getAnimatedValue();
                            textView15.setText(String.valueOf(color));
                            textView15.setTextColor(color);
                            textView_Animator.setTextColor(color);
                            Log.i("color",String.valueOf (color));
                        }
                    });

                    valueAnimator_rgb.setDuration(4000);
                    valueAnimator_rgb.start();

                }


                valueAnimator.setDuration(4000);
                valueAnimator.start();


            }
        });


    }
}
