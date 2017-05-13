package com.example.sid.blinkingeffest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvanimation;
    Button btnStartAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void StartAnimation(View v){
        Animation myanimation = AnimationUtils.loadAnimation(this,R.anim.myanimation);
        tvanimation = (TextView) findViewById(R.id.tvanimation);
        btnStartAnimation = (Button) findViewById(R.id.btnStartAnimation);
        tvanimation.setVisibility(View.VISIBLE);
        tvanimation.startAnimation(myanimation);
    }
}
