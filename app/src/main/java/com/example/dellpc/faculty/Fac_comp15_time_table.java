package com.example.dellpc.faculty;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Fac_comp15_time_table extends AppCompatActivity {

    private TextView tv_heading_comp15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fac_comp15_time_table);

        tv_heading_comp15 = (TextView) findViewById(R.id.tv_heading_comp15);

        tv_heading_comp15.animate().scaleX(5);
        tv_heading_comp15.animate().scaleY(5);
        new CountDownTimer(1000,1) {
            @Override
            public void onTick(long ar) {

            }

            @Override
            public void onFinish() {

                tv_heading_comp15.animate().scaleX((float) 1);
                tv_heading_comp15.animate().scaleY((float) 1);

            }
        }.start();

    }

}
