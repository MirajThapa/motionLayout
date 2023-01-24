package com.example.motionlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.motionlayout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        Glide.with(this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRe0O0260hzKyKursZUTtZAxECP0gSVJ2JXwQ&usqp=CAU").into(activityMainBinding.imgSmallScreenImageSection);
        Glide.with(this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5_f-3Npwnj40B6u8O8WmcX8swxRqUS8ncQg&usqp=CAU").into(activityMainBinding.imgFullScreenImageSection);

//        MotionLayout motionConteiner = activityMainBinding.motionContainer;
//        activityMainBinding.imgSmallScreen.setOnClickListener((v) -> {
//            motionConteiner.setTransition(R.id.startSmallScreen, R.id.endSmallScreen);
//            motionConteiner.setTransition(R.id.startFullScreen, R.id.endFullScreen);
//            motionConteiner.transitionToEnd();//
//        });
//        button2.setOnClickListener((v) -> {
//            motionConteiner.setTransition(R.id.start2, R.id.end2);
//            motionConteiner.transitionToEnd();//
//        });
    }
}