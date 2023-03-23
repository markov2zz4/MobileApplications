package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    AnimationDrawable backgroundAnimation;

    AnimationDrawable barAnimation;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        constraintLayout = findViewById(R.id.secondLayout);

        backgroundAnimation = (AnimationDrawable) constraintLayout.getBackground();
        backgroundAnimation.setEnterFadeDuration(2500);
        backgroundAnimation.setExitFadeDuration(5000);
        backgroundAnimation.start();

        imageView = (ImageView)findViewById(R.id.bar_icon);
        imageView.setBackgroundResource(R.drawable.bar_animation);
        barAnimation = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        barAnimation.start();
    }
}