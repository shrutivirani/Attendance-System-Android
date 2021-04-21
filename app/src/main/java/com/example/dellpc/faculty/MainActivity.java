package com.example.dellpc.faculty;

import android.animation.AnimatorSet;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,Fac_Time_table_display.OnFragmentInteractionListener,Student_Detail.OnFragmentInteractionListener,Help.OnFragmentInteractionListener,FAQ.OnFragmentInteractionListener,Enrollment_attendance.OnFragmentInteractionListener{

    private int i;
  //  private ListView listview_sd;
    private Button btn_back;
    private int j=1;
    private RelativeLayout rt;
    private LinearLayout lnr_1;
    private Button btn_attendance;
    private RelativeLayout rel_heading_fac_drwr;
/*
    String[] Class_namee ={
            "Comp12",
            "Comp11",
            "Comp14",
            "Civil12",
            "Comp12",
            "Comp13",
            "Elec14"};
    String[] sub_txx ={
            "JAVA",
            "CD",
            "C",
            "CPU",
            "ANDROID",
            "TOC",
            "CPU"};
    String[] typee ={
            "Lecture",
            "Lecture",
            "Lecture",
            "Lecture",
            "Lecture",
            "Lecture",
            "Lecture"};

    String[] Roomm ={
            "120",
            "144",
            "201",
            "101",
            "140",
            "130",
            "120"};

    String[] color={"#f6d0da","#fd5b84","#a43752"};




*/


    String[] Start_name ={
            "Session",
            "Time Table",
            "Student Details",
    "Etc"};

    int[] start_icon ={
            R.drawable.session,
            R.drawable.time_t,
            R.drawable.s_details,
            R.drawable.s_details};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        Button add_bt=(Button)findViewById(R.id.button_add);
        add_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Class_name1 = (TextView)findViewById(R.id.Class_name);


                Intent it = new Intent(getBaseContext(),attendance_list.class);
                it.putExtra("c_name",Class_name1.getText().toString());
                startActivity(it);



            }
        });

//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        //listview_sd = (ListView)findViewById(R.id.lstvw);



/*

        ArrayList<String> arrayString = new ArrayList<String>();
        arrayString.add("Comp12");
        arrayString.add("Comp11");
        arrayString.add("Comp14");
        arrayString.add("Civil12");
        arrayString.add("Comp12");
        arrayString.add("Comp12");
        arrayString.add("Comp13");
        arrayString.add("Elec14");*/

       // ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayString);
       // listview.setAdapter(adapter);

        //*listview.setAdapter(new Session_list(this));
/*

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
        for(int i=0;i<7;i++)
        {
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("Class_namee", Class_namee[i]);
            hm.put("sub_txx",sub_txx[i]);
            hm.put("typee",typee[i]);
            hm.put("Roomm",Roomm[i]);
 // hm.put("ID",c.getString(c.getColumnIndex("ID")).toString());
  // hm.put("C_Timee",c.getString(c.getColumnIndex("C_Timee")).toString());
  //  hm.put("Acc",c.getString(c.getColumnIndex("Acc")).toString());
   aList.add(hm);
        }

        String[] from = {"Class_namee","sub_txx","typee","Roomm"};


        int[] to = { R.id.Class_name,R.id.sub_tx,R.id.type_tx,R.id.Class_tx};


        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.session_list, from, to);



        listview.setAdapter(adapter);

      */


        LinearLayout mLinearListView = (LinearLayout) findViewById(R.id.Line_start_list);

        /**
         * Add item into arraylist
         */


        /***
         * adding item into listview
         */
        for (int i = 0; i <4; i++) {
            /**
             * inflate items/ add items in linear layout instead of listview
             */
            LayoutInflater inflater = null;
            inflater = (LayoutInflater) getApplicationContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View mLinearView = inflater.inflate(R.layout.start_list, null);
            /**
             * getting id of row.xml
             */
            final TextView mFirstName = (TextView) mLinearView
                    .findViewById(R.id.start_item_name);
            ImageView mimg = (ImageView) mLinearView
                    .findViewById(R.id.start_img);

            LinearLayout img_Clk = (LinearLayout) mLinearView
                    .findViewById(R.id.hhhh);
             /**
             * set item into row
             */

            mFirstName.setText(Start_name[i]);

            mimg.setImageResource(start_icon[i]);


            /**
             * add view in top linear
             */

            mLinearListView.addView(mLinearView);

            /**
             * get item row on click
             *
             */
            img_Clk.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    if( mFirstName.getText().toString().equals("Session"))
                    {
                        Intent i = new Intent(getBaseContext(),today_sesstion.class);
                        startActivity(i);

                    }
                    else if(mFirstName.getText().toString().equals("Time Table"))
                    {
                        Intent i = new Intent(getBaseContext(),Stu_class_time_table.class);
                        startActivity(i);
                    }
                    else if(mFirstName.getText().toString().equals("Student Details"))
                    {
                        Toast.makeText(MainActivity.this, "Haju banvato dee..",
                                        Toast.LENGTH_SHORT).show();
                    }
                    else if(mFirstName.getText().toString().equals("Etc"))
                    {
                        Toast.makeText(MainActivity.this, "Haju banvato dee..",
                                Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }
     /*   listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {



            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // TODO Auto-generated method stub

                TextView Class_name1 = (TextView) arg1.findViewById(R.id.Class_name);


                Intent it = new Intent(getBaseContext(),attendance_list.class);
                it.putExtra("c_name",Class_name1.getText().toString());
                startActivity(it);





            }

        });*/





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
          //  moveTaskToBack(true);
        }



    }


    @Override
    protected void onResume() {
        super.onResume();

//        Toast.makeText(MainActivity.this, "App Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

//        Toast.makeText(MainActivity.this, "App Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_ttable) {
            //listview_sd.setVisibility(View.GONE);
            //btn_attendance.setVisibility(View.GONE);
            //Fac_Time_table_display fac_time_table_display = new Fac_Time_table_display();
           // FragmentTransaction fragmentManager = getFragmentManager().beginTransaction().replace(R.id.frm_fac,fac_time_table_display);
          //  fragmentManager.commit();
            // Handle the camera action
        } else if (id == R.id.nav_student_detail) {
          //  listview_sd.setVisibility(View.GONE);
      //      btn_attendance.setVisibility(View.GONE);
    //        Student_Detail student_detail = new Student_Detail();
  //          FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.frm_fac,student_detail);
//            fragmentTransaction.commit();

        } else if (id == R.id.nav_help) {
           // listview_sd.setVisibility(View.GONE);
        //    btn_attendance.setVisibility(View.GONE);
         //   Help help = new Help();
           // FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.frm_fac,help);
            //fragmentTransaction.commit();

        } else if (id == R.id.nav_faq) {
            //listview_sd.setVisibility(View.GONE);
           // btn_attendance.setVisibility(View.GONE);
           // FAQ faq = new FAQ();
           // FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.frm_fac,faq);
          //  fragmentTransaction.commit();

        } else {
            if (id == R.id.nav_logout) {
             //   btn_attendance.setVisibility(View.GONE);
              //  listview_sd.setVisibility(View.GONE);
//            Intent i = new Intent(MainActivity.this,Logout.class);
//            startActivity(i);
                final AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setTitle("Are you Sure Want to Logout !!!");
                ab.setIcon(R.drawable.icon_logout);
                ab.setCancelable(false);
                ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(i);
                    }
                });
                ab.setPositiveButton("LogOut", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(MainActivity.this,first_main_Thread.class);
                        startActivity(i);

                    }
                });


                ab.show();

            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }




}
