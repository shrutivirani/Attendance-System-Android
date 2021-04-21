package com.example.dellpc.faculty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private TextView username;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button login_bt = (Button)findViewById(R.id.log_in_bt);


        login_bt.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    login_bt.animate().scaleX((float) 1.1).setDuration(70);
                    login_bt.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    login_bt.animate().scaleX(1).setDuration(70);

                    login_bt.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });
        username = (TextView) findViewById(R.id.username);

        password = (TextView) findViewById(R.id.password);
password.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(username.getText().toString().length()<3) {
                    username.setError("Minimum 3 character required");
                }
                else{

                }

//            }
        return false;
    }
});

//        password.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public void onClick(View v) {
//
//
//        });


        login_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (password.getText().toString().length() < 5) {
                    password.setError("Minimum 5 character is required");

                } else {
                    startActivity(new Intent(Login.this, MainActivity.class));
                }


            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();

//        Toast.makeText(Login.this, "Login Restart", Toast.LENGTH_SHORT).show();


        Intent i=new Intent(Login.this,MainActivity.class);
        startActivity(i);

    }
}
