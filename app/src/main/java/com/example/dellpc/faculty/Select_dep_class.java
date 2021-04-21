package com.example.dellpc.faculty;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.text.InputFilter;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




public class Select_dep_class extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_dep);
      /*  String[] Dep_name = new String[] {
                "COMP",
                "CIVIL",
                "ELEC",
                "CHEM",
                "MECH"

        };*/
        ListView listView = ( ListView ) findViewById(R.id.dep_list_view);


/*

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<5;i++){
            HashMap<String, String> hm = new HashMap<String,String>();

            hm.put("D_name",Dep_name[i]);

            //   hm.put("Acc",c.getString(c.getColumnIndex("Acc")).toString());


            aList.add(hm);


        }

        String[] from = {"D_name"};


        int[] to = { R.id.D_name};


        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.activity_select_dep_list, from, to);

*/
        listView.setAdapter(new CustomListAdapter(this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Select_dep_class.this);
                alertDialog.setTitle("Enter Enrollment No.");
                alertDialog.setIcon(R.drawable.icon_go_enrollment);
                alertDialog.setCancelable(false);
                final EditText input = new EditText(Select_dep_class.this);
                input.setMaxWidth(12);
                input.setMaxLines(1);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                input.setTextSize(42);
                int maxLength = 12;
                InputFilter[] FilterArray = new InputFilter[1];
                FilterArray[0] = new InputFilter.LengthFilter(maxLength);
                input.setFilters(FilterArray);
                input.setGravity(View.TEXT_ALIGNMENT_CENTER);
                input.setTextColor(Color.parseColor("#fd5b84"));
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                alertDialog.setView(input);
                alertDialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Select_dep_class.this, Student_Navigation_drawer.class);
                        startActivity(i);

                    }
                });
                alertDialog.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Select_dep_class.this, Select_dep_class.class);
                                startActivity(i);
                            }
                        }

                );

                alertDialog.show();


            }

        });
    }




}







