package com.example.dellpc.faculty;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Vishal on 09-01-2016.
 */
public class CustomListAdapter extends BaseAdapter {

    String[] Dep_name ={"COMP",
            "CIVIL",
            "ELEC",
            "CHEM",
            "MECH"};
    int[] icon={R.drawable.comp,R.drawable.civil,R.drawable.elec,R.drawable.chem,R.drawable.mech};
    String[] color={"#a788ae","#fe5d58","#49c9af","#5dc4ee","#da9113"};

    private Context context;
    CustomListAdapter(Context context){
        this.context=context;

    }
    @Override
    public int getCount(){
        return 5;

    }

    @Override
    public Object getItem(int position){
        return position;
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position,View convertview, ViewGroup parent){
        View row = null;
        if(convertview==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.activity_select_dep_list, parent, false);



            LinearLayout Lin_lay = (LinearLayout) row.findViewById(R.id.Lin_lay);


            Lin_lay.setBackgroundColor(Color.parseColor(color[position]));
        }else{
            row=convertview;


        }
        ImageView imageview = (ImageView) row.findViewById(R.id.imageView);
        TextView textview = (TextView) row.findViewById(R.id.D_name);
        imageview.setImageResource(icon[position]);
        textview.setText(Dep_name[position]);

        return row;
    }

}
