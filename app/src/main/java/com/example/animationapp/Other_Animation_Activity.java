package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Other_Animation_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_animation);

        final ImageView img = findViewById(R.id.imageViewOther);
        Button scBtn = findViewById(R.id.scaleBtn);
        Button fdBtn = findViewById(R.id.fadeBtn);
        fdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(Other_Animation_Activity.this,R.anim.fade);
                img.startAnimation(animation);
            }
        });
        scBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(Other_Animation_Activity.this,R.anim.scale);
                img.startAnimation(animation);
            }
        });

    }

}