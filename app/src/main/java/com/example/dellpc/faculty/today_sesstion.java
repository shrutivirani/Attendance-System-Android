package com.example.dellpc.faculty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class today_sesstion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_sesstion);
       ListView listview = (ListView)findViewById(R.id.lstvw);

        listview.setAdapter(new Session_list(this));
    }
}
