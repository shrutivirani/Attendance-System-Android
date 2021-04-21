package com.example.dellpc.faculty;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vishal on 09-01-2016.
 */
public class Session_list extends BaseAdapter {

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
   // int[] icon={R.drawable.comp,R.drawable.civil,R.drawable.elec,R.drawable.chem,R.drawable.mech};


     Context context;
    public static LayoutInflater inflater=null;

    Session_list(Context context){
        this.context=context;
inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }
    @Override
    public int getCount(){
        return Roomm.length;

    }

    @Override
    public Object getItem(int position){
        return position;

    }

    @Override
    public long getItemId(int position){
        return position;
    }

public class Holder
{
    TextView tv;

}


    @Override
    public View getView(final int position,View convertview, ViewGroup parent) {
        Holder holder = new Holder();

        View rowView;
        rowView = inflater.inflate(R.layout.session_list, null);

        TextView Class_name1 = (TextView) rowView.findViewById(R.id.Class_name);
        TextView sub_tx1 = (TextView) rowView.findViewById(R.id.sub_tx);
        TextView type_tx1 = (TextView) rowView.findViewById(R.id.type_tx);
        TextView Class_tx1 = (TextView) rowView.findViewById(R.id.Class_tx);
        Class_name1.setText(Class_namee[position]);
        sub_tx1.setText(sub_txx[position]);
        type_tx1.setText(typee[position]);
        Class_tx1.setText(Roomm[position]);
        LinearLayout Lin_l = (LinearLayout) rowView.findViewById(R.id.hhhh);

        if (position <= 2) {
            Lin_l.setBackgroundColor(Color.parseColor(color[0]));
        } else if (position == 3) {
            Lin_l.setBackgroundColor(Color.parseColor(color[1]));

            Animation rotation = AnimationUtils.loadAnimation(context, R.anim.left_right);
            rotation.setRepeatCount(ObjectAnimator.INFINITE);
            Lin_l.startAnimation(rotation);

        } else if (position >= 4) {
            Lin_l.setBackgroundColor(Color.parseColor(color[2]));

        }

        return rowView;
    }

}
