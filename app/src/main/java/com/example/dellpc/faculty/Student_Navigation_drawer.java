package com.example.dellpc.faculty;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Student_Navigation_drawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener ,Student_Profile.OnFragmentInteractionListener,Attendance.OnFragmentInteractionListener {

    private RelativeLayout rl_stu;
    private LinearLayout lnr_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__navigation_drawer);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_stud);
        setSupportActionBar(toolbar);

//        rl_stu=(RelativeLayout) findViewById(R.id.rl_stu);


//        getSupportActionBar().hide();
//               setSupportActionBar(toolbar);


//        getSupportActionBar().setDisplayShowTitleEnabled(true);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_stud);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view_stud);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_stud);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_attendance) {
/*            Time_Table time_table = new Time_Table();
            FragmentTransaction fragmentManager = getFragmentManager().beginTransaction().replace(R.id.frm_fac, time_table);
            fragmentManager.commit();*/
            Attendance attendance = new Attendance();

            FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction().replace(R.id.frm_stu, attendance);

            fragmentTransaction.commit();

        } else if (id == R.id.nav_stu_profile) {
            Student_Profile student_profile = new Student_Profile();

            FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction().replace(R.id.frm_stu, student_profile);

            fragmentTransaction.commit();

        } else if (id == R.id.nav_ttable) {
            Intent i = new Intent(Student_Navigation_drawer.this,Stu_class_time_table.class);
            startActivity(i);

        }

        else if (id == R.id.nav_share) {


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_stud);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
