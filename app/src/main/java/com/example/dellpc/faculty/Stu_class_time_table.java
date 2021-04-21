package com.example.dellpc.faculty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Stu_class_time_table extends AppCompatActivity {

    private Button btn_comp12;
    private Button btn_comp13;
    private Button btn_comp14;
    private Button btn_comp15;
    private LinearLayout lnr_comp12;
    private LinearLayout lnr_comp13;
    private LinearLayout lnr_comp14;
    private LinearLayout lnr_comp15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_class_time_table);
        lnr_comp12 = (LinearLayout)findViewById(R.id.lnr_comp12);
        lnr_comp13 = (LinearLayout)findViewById(R.id.lnr_comp13);
        lnr_comp14 = (LinearLayout)findViewById(R.id.lnr_comp14);
        lnr_comp15 = (LinearLayout)findViewById(R.id.lnr_comp15);
        btn_comp12 = (Button) findViewById(R.id.btn_comp12);
        btn_comp13 = (Button) findViewById(R.id.btn_comp13);
        btn_comp14 = (Button) findViewById(R.id.btn_comp14);
        btn_comp15 = (Button) findViewById(R.id.btn_comp15);


        lnr_comp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Stu_class_time_table.this,Fac_comp12_time_table.class);
                startActivity(i);
            }
        });
        lnr_comp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Stu_class_time_table.this,Fac_comp13_time_table.class);
                startActivity(i);
            }
        });
        lnr_comp14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Stu_class_time_table.this,Fac_comp14_time_table.class);
                startActivity(i);
            }
        });
        lnr_comp15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Stu_class_time_table.this,Fac_comp15_time_table.class);
                startActivity(i);
            }
        });

        btn_comp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Stu_class_time_table.this,Fac_comp12_time_table.class);
                startActivity(i);
            }
        });
        btn_comp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Stu_class_time_table.this,Fac_comp13_time_table.class);
                startActivity(i);
            }
        });
        btn_comp14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Stu_class_time_table.this,Fac_comp14_time_table.class);
                startActivity(i);
            }
        });
        btn_comp15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Stu_class_time_table.this,Fac_comp15_time_table.class);
                startActivity(i);
            }
        });
    }
}
