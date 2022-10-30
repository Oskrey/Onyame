package com.example.onyame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = findViewById(R.id.animationView);
        // кладём кота в на форму
        img.setImageResource(R.drawable.cat);
        // говорим как прыгать
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.cat_animation);
        // пускаем прыгать
        img.startAnimation(animation);


    }
}