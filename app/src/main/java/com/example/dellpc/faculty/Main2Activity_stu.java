package com.example.dellpc.faculty;

import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity_stu extends AppCompatActivity {

    private TextView tv;
    private Spinner sp;
    private Button btn_comp_dept;
    private Button btn_civil_dept;
    private Button btn_mech_dept;
    private Button btn_elec_dept;
    private Button btn_chem_dept;
    private Color colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activity_stu);

//                sp = (Spinner) findViewById(R.id.sp);
//                String[] str ={"abc","def","hji"};
//
//                ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(Main2Activity_stu.this,android.R.layout.simple_list_item_1,str);
//                sp.setAdapter(arrayAdapter);
        btn_comp_dept = (Button) findViewById(R.id.btn_comp_dept);
        btn_civil_dept = (Button) findViewById(R.id.btn_civil_dept);
        btn_mech_dept = (Button) findViewById(R.id.btn_mech_dept);
        btn_elec_dept = (Button) findViewById(R.id.btn_elec_dept);
        btn_chem_dept = (Button) findViewById(R.id.btn_chem_dept);

        btn_comp_dept.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    btn_comp_dept.animate().scaleX((float) 1.1).setDuration(70);
                    btn_comp_dept.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    btn_comp_dept.animate().scaleX(1).setDuration(70);

                    btn_comp_dept.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });

        btn_comp_dept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Main2Activity_stu.this);
                alertDialog.setTitle("Enter Enrollment No.");
                alertDialog.setIcon(R.drawable.icon_go_enrollment);
                alertDialog.setCancelable(false);
                final EditText input = new EditText(Main2Activity_stu.this);
                input.setMaxWidth(12);
                input.setMaxLines(1);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                input.setTextSize(42);
                int maxLength = 12;
                InputFilter[] FilterArray = new InputFilter[1];
                FilterArray[0] = new InputFilter.LengthFilter(maxLength);
                input.setFilters(FilterArray);
                input.setGravity(View.TEXT_ALIGNMENT_CENTER);
                input.setTextColor(colors.parseColor("#fd5b84"));
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                alertDialog.setView(input);
                alertDialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Main2Activity_stu.this, Student_Navigation_drawer.class);
                        startActivity(i);

                    }
                });
                alertDialog.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Main2Activity_stu.this, Main2Activity_stu.class);
                                startActivity(i);
                            }
                        }

                );

                alertDialog.show();
            }
        });
        btn_civil_dept.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    btn_civil_dept.animate().scaleX((float) 1.1).setDuration(70);
                    btn_civil_dept.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    btn_civil_dept.animate().scaleX(1).setDuration(70);

                    btn_civil_dept.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });
        btn_civil_dept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Main2Activity_stu.this);
                alertDialog.setTitle("Enter Enrollment No.");
                alertDialog.setIcon(R.drawable.icon_go_enrollment);
                alertDialog.setCancelable(false);
                final EditText input = new EditText(Main2Activity_stu.this);
                input.setMaxWidth(12);
                input.setMaxLines(1);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                input.setTextSize(42);
                int maxLength = 12;
                InputFilter[] FilterArray = new InputFilter[1];
                FilterArray[0] = new InputFilter.LengthFilter(maxLength);
                input.setFilters(FilterArray);
                input.setGravity(View.TEXT_ALIGNMENT_CENTER);
                input.setTextColor(colors.parseColor("#fd5b84"));
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                alertDialog.setView(input);
                alertDialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Main2Activity_stu.this, Student_Navigation_drawer.class);
                        startActivity(i);

                    }
                });
                alertDialog.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Main2Activity_stu.this, Main2Activity_stu.class);
                                startActivity(i);
                            }
                        }

                );

                alertDialog.show();
            }
        });
        btn_mech_dept.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    btn_mech_dept.animate().scaleX((float) 1.1).setDuration(70);
                    btn_mech_dept.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    btn_mech_dept.animate().scaleX(1).setDuration(70);

                    btn_mech_dept.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });
        btn_mech_dept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Main2Activity_stu.this);
                alertDialog.setTitle("Enter Enrollment No.");
                alertDialog.setIcon(R.drawable.icon_go_enrollment);
                alertDialog.setCancelable(false);
                final EditText input = new EditText(Main2Activity_stu.this);
                input.setMaxWidth(12);
                input.setMaxLines(1);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                input.setTextSize(42);
                int maxLength = 12;
                InputFilter[] FilterArray = new InputFilter[1];
                FilterArray[0] = new InputFilter.LengthFilter(maxLength);
                input.setFilters(FilterArray);
                input.setGravity(View.TEXT_ALIGNMENT_CENTER);
                input.setTextColor(colors.parseColor("#fd5b84"));
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                alertDialog.setView(input);
                alertDialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Main2Activity_stu.this, Student_Navigation_drawer.class);
                        startActivity(i);

                    }
                });
                alertDialog.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Main2Activity_stu.this, Main2Activity_stu.class);
                                startActivity(i);
                            }
                        }

                );

                alertDialog.show();
            }
        });
        btn_elec_dept.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    btn_elec_dept.animate().scaleX((float) 1.1).setDuration(70);
                    btn_elec_dept.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    btn_elec_dept.animate().scaleX(1).setDuration(70);

                    btn_elec_dept.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });
        btn_elec_dept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Main2Activity_stu.this);
                alertDialog.setTitle("Enter Enrollment No.");
                alertDialog.setIcon(R.drawable.icon_go_enrollment);
                alertDialog.setCancelable(false);
                final EditText input = new EditText(Main2Activity_stu.this);
                input.setMaxWidth(12);
                input.setMaxLines(1);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                input.setTextSize(42);
                int maxLength = 12;
                InputFilter[] FilterArray = new InputFilter[1];
                FilterArray[0] = new InputFilter.LengthFilter(maxLength);
                input.setFilters(FilterArray);
                input.setGravity(View.TEXT_ALIGNMENT_CENTER);
                input.setTextColor(colors.parseColor("#fd5b84"));
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                alertDialog.setView(input);
                alertDialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Main2Activity_stu.this, Student_Navigation_drawer.class);
                        startActivity(i);

                    }
                });
                alertDialog.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Main2Activity_stu.this, Main2Activity_stu.class);
                                startActivity(i);
                            }
                        }

                );

                alertDialog.show();
            }
        });
        btn_chem_dept.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    btn_chem_dept.animate().scaleX((float) 1.1).setDuration(70);
                    btn_chem_dept.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    btn_chem_dept.animate().scaleX(1).setDuration(70);

                    btn_chem_dept.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });
        btn_elec_dept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(Main2Activity_stu.this);
                alertDialog.setTitle("Enter Enrollment No.");
                alertDialog.setIcon(R.drawable.icon_go_enrollment);
                alertDialog.setCancelable(false);
                final EditText input = new EditText(Main2Activity_stu.this);
                input.setMaxWidth(12);
                input.setMaxLines(1);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                input.setTextSize(42);
                input.setHint("Type Here");
                input.setHintTextColor(colors.parseColor("#FFB6C1"));
                int maxLength = 12;
                InputFilter[] FilterArray = new InputFilter[1];
                FilterArray[0] = new InputFilter.LengthFilter(maxLength);
                input.setFilters(FilterArray);
                input.setGravity(View.TEXT_ALIGNMENT_CENTER);
                input.setTextColor(colors.parseColor("#fd5b84"));
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                alertDialog.setView(input);
                alertDialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if ((input.length() == 12)) {
                            Intent i = new Intent(Main2Activity_stu.this, Student_Navigation_drawer.class);
                            startActivity(i);
                        } else {
                            alertDialog.setCancelable(true);
                            Toast.makeText(Main2Activity_stu.this,"Minimum 12 Digit Required",Toast.LENGTH_SHORT).show();
                        }


                    }
                });
                alertDialog.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Main2Activity_stu.this, Main2Activity_stu.class);
                                startActivity(i);
                            }
                        }

                );

                alertDialog.show();
            }
        });



    }
}
