package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class StopAct extends AppCompatActivity
{
    Button btnstart;
    ImageView icanchor;
    Animation roundingalone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);

        btnstart=findViewById(R.id.btnstart);
        icanchor=findViewById(R.id.icanchor);

        // Load Animation
        roundingalone= AnimationUtils.loadAnimation(this,R.anim.roundingalone);
        // Importing font
        Typeface MMedium=Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");

        btnstart.setTypeface(MMedium);
        // Customizing Font
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icanchor.startAnimation(roundingalone);
            }
        });
    }
}