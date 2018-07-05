package com.example.hp15.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMessgae;
    Button btnStart;
    ImageView img;

    Animation animation1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessgae = (TextView)findViewById(R.id.textView3);
        btnStart = (Button)findViewById(R.id.btnStart);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessgae.setVisibility(View.VISIBLE);

                animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);

                txtMessgae.startAnimation(animation1);
            }
        });


    }
}
