package com.example.luckruound;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private Button button1;
private ImageView luck;
private TextView text1;
private TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        luck = (ImageView)findViewById(R.id.luck);
        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = (int) (Math.random()* 361);
                Animator anim1 = ObjectAnimator.ofFloat(luck,"rotation",0,n);
                text1.setText(n+"°");
                if (n<=90){
                    text2.setText("四等奖");
                }
                else if(n>90&&n<=180){
                    text2.setText("三等奖");
                }
                else if(n>180&&n<=270){
                    text2.setText("二等奖");
                }
                else{
                    text2.setText("一等奖");
                }
                anim1.setDuration(2000);
                anim1.start();

            }
        });
    }
}
