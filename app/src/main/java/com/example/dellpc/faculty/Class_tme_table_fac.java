package com.example.dellpc.faculty;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Class_tme_table_fac extends AppCompatActivity {

    private LinearLayout lnr_comp12;
    private LinearLayout lnr_comp13;
    private LinearLayout lnr_comp14;
    private LinearLayout lnr_comp15;
    private Button btn_comp12;
    private Button btn_comp13;
    private Button btn_comp14;
    private Button btn_comp15;
    private TextView tv_heading_fac_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_tme_table_fac);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_stud);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setIcon(R.drawable.back_icon);

        tv_heading_fac_class = (TextView) findViewById(R.id.tv_heading_fac_class);

        lnr_comp12 = (LinearLayout)findViewById(R.id.lnr_comp12);
        lnr_comp13 = (LinearLayout)findViewById(R.id.lnr_comp13);
        lnr_comp14 = (LinearLayout)findViewById(R.id.lnr_comp14);
        lnr_comp15 = (LinearLayout)findViewById(R.id.lnr_comp15);
        btn_comp12 = (Button) findViewById(R.id.btn_comp12);
        btn_comp13 = (Button) findViewById(R.id.btn_comp13);
        btn_comp14 = (Button) findViewById(R.id.btn_comp14);
        btn_comp15 = (Button) findViewById(R.id.btn_comp15);

        tv_heading_fac_class.animate().scaleX(5);
        tv_heading_fac_class.animate().scaleY(5);
        new CountDownTimer(1000,1) {
            @Override
            public void onTick(long ar) {

            }

            @Override
            public void onFinish() {

                tv_heading_fac_class.animate().scaleX((float) 1);
                tv_heading_fac_class.animate().scaleY((float) 1);

            }
        }.start();


        lnr_comp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Class_tme_table_fac.this,Fac_comp12_time_table.class);
                startActivity(i);
            }
        });
        lnr_comp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Class_tme_table_fac.this,Fac_comp13_time_table.class);
                startActivity(i);
            }
        });
        lnr_comp14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Class_tme_table_fac.this,Fac_comp14_time_table.class);
                startActivity(i);
            }
        });
        lnr_comp15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Class_tme_table_fac.this,Fac_comp15_time_table.class);
                startActivity(i);
            }
        });

        btn_comp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Class_tme_table_fac.this,Fac_comp12_time_table.class);
                startActivity(i);
            }
        });
        btn_comp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Class_tme_table_fac.this,Fac_comp13_time_table.class);
                startActivity(i);
            }
        });
        btn_comp14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Class_tme_table_fac.this,Fac_comp14_time_table.class);
                startActivity(i);
            }
        });
        btn_comp15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Class_tme_table_fac.this,Fac_comp15_time_table.class);
                startActivity(i);
            }
        });
    }

}
