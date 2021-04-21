package com.example.dellpc.faculty;

import android.app.ActionBar;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class first_main_Thread extends AppCompatActivity {

    private int i;
    private LinearLayout lnr_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_main__thread);

//        getActionBar().hide();

//        getSupportActionBar().hide();

        ImageView logo_img =(ImageView)findViewById(R.id.logo_imgg);

        RelativeLayout rt =(RelativeLayout)findViewById(R.id.option_lay1);
        rt.animate().translationX(500);


        logo_img.animate().scaleX(5);
        logo_img.animate().scaleY(5);
        new CountDownTimer(1000,1) {
            @Override
            public void onTick(long ar) {

            }

            @Override
            public void onFinish() {

                //	 Intent intentToBePassedToNextActivity = new Intent(getBaseContext(),Home.class);
                //	startActivity(intentToBePassedToNextActivity);
                //overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
                //	MainActivity.this.finish();
                //	overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
                ImageView logo_img =(ImageView)findViewById(R.id.logo_imgg);

                logo_img.setVisibility(View.VISIBLE);
                logo_img.animate().scaleX((float) 1);
                logo_img.animate().scaleY((float) 1);


                new CountDownTimer(5000,1) {
                    @Override
                    public void onTick(long ar) {

                    }

                    @Override
                    public void onFinish() {

                        //	 Intent intentToBePassedToNextActivity = new Intent(getBaseContext(),Home.class);
                        //	startActivity(intentToBePassedToNextActivity);
                        //overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
                        //	MainActivity.this.finish();
                        //	overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
                        RelativeLayout rt =(RelativeLayout)findViewById(R.id.option_lay1);

                        rt.setVisibility(View.VISIBLE);
                        rt.animate().translationX(0);

                    }

                }.start();

            }

        }.start();



        final ImageView sff =(ImageView)findViewById(R.id.staff_ck);
        final ImageView stu =(ImageView)findViewById(R.id.stu_ck);

        sff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent intentToBePassedToNextActivity = new Intent(getBaseContext(),Login.class);

                startActivity(intentToBePassedToNextActivity);

            }
        });

        stu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intentToBePassedToNextActivity = new Intent(first_main_Thread.this,Select_dep_class.class);

                startActivity(intentToBePassedToNextActivity);
//                lnr_class = (LinearLayout) findViewById(R.id.lnr_class);
//                lnr_class.setVisibility(View.GONE);


            }
        });

        sff.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if(arg1.getAction() == MotionEvent.ACTION_DOWN)
                {

                    sff.animate().scaleX((float) 1.1).setDuration(70);
                    sff.animate().scaleY((float) 1.1).setDuration(70);



                }


                else if(arg1.getAction() == MotionEvent.ACTION_UP)
                {

                    sff.animate().scaleX(1).setDuration(70);
                    sff.animate().scaleY(1).setDuration(70);





                }

                return false;
            }
        });

        Animation rotation = AnimationUtils.loadAnimation(this, R.anim.test);
        rotation.setRepeatCount(Animation.INFINITE);
        sff.startAnimation(rotation);



        stu.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if(arg1.getAction() == MotionEvent.ACTION_DOWN)
                {

                    stu.animate().scaleX((float) 1.1).setDuration(70);
                    stu.animate().scaleY((float) 1.1).setDuration(70);



                }


                else if(arg1.getAction() == MotionEvent.ACTION_UP)
                {

                    stu.animate().scaleX(1).setDuration(70);
                    stu.animate().scaleY(1).setDuration(70);





                }

                return false;
            }
        });
        stu.startAnimation(rotation);


    }


    @Override
    public void onBackPressed() {


        i++;
        if (i == 1) {
            Toast.makeText(this, "Press again to exit.",
                    Toast.LENGTH_SHORT).show();
        }
        else  {
            finish();
            super.onBackPressed();
        }


    }


}
