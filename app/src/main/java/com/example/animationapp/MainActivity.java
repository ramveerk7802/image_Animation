package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.showImageBtn);
        Button otherBtn = findViewById(R.id.showotherBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent img_activity = new Intent(MainActivity.this,Image_Activity.class);
                startActivity(img_activity);
            }
        });

        otherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  other_activity = new Intent(MainActivity.this,Other_Animation_Activity.class);
                startActivity(other_activity);
            }
        });

//        public void color_animation_activity(View view){
//            Intent activity = new Intent(MainActivity.this,Color_Activity.class);
//            startActivity(activity);
//        }
    }


}