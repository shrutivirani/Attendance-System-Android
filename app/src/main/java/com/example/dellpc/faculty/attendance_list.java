package com.example.dellpc.faculty;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.InputFilter;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SectionIndexer;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import static com.example.dellpc.faculty.R.drawable.p;
import static com.example.dellpc.faculty.R.drawable.a;

public class attendance_list extends Activity {
    TextView count;
    ListView lv;
    String[] stu_name = new String[]{
            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",           "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani",            "Shruti Virani", "Shruti Virani",            "Shruti Virani"
    };
    String[] Eno = new String[]{
            "123456789001",            "123456789002",            "123456789003",            "123456789004",            "123456789005",            "123456789006",            "123456789007",            "123456789008",            "123456789009",            "123456789010",            "123456789011",            "123456789012",            "123456789013",            "123456789014",            "123456789015",            "123456789016",            "123456789017",            "123456789018",            "123456789019",            "123456789020",            "123456789021",            "123456789022",            "123456789023",            "123456789024",            "123456789025",            "123456789026",            "123456789027",            "123456789028",            "123456789029",            "123456789030",            "123456789031",            "123456789032",
            "123456789033",            "123456789034"
    };

    Boolean[] AP = new Boolean[]{
            true, true, true, true,            true, true, true, true,
            true, true, true, true,            true, true, true, true,
            true, true, true, true,            true, true,
            true, true, true, true,            true, true, true, true,
            true, true, true, true
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance_listview);

        lv = (ListView) findViewById(R.id.stu_list_view);


        lv.setAdapter(new clist(this, stu_name,Eno,AP));
        lv.setFastScrollEnabled(true);

      count = (TextView)findViewById(R.id.tx_total);
        Integer dd = Eno.length;

        count.setText(dd.toString());



    }

    //public void add()
    //{

       // setContentView(R.layout.attendance_listview);


//        count.setText(Integer.parseInt(count.getText().toString())+1);
    //}




    class clist extends BaseAdapter implements SectionIndexer {

        LayoutInflater inflater;

        Context ctx;
        HashMap<String, Integer> alphaindex;
        String[] selection;
        String[] stu_name,Eno;

        Boolean[] AP ;
        Integer ct =null;

        public clist(Context ctx,String[] stu_name,String[] Eno,Boolean[] AP) {

            this.ctx = ctx;
            this.stu_name=stu_name;
            this.Eno=Eno;
            this.AP=AP;

            alphaindex = new HashMap<String, Integer>();
            int size = Eno.length;

            for (int i = 0; i < Eno.length; i++) {


                String s = Eno[i];
                String ch = s.substring(9, 12);
                if (!alphaindex.containsKey(ch))
                    alphaindex.put(ch, i);


            }

            Set<String> ss = alphaindex.keySet();
            ArrayList<String> st = new ArrayList<String>(ss);
            Collections.sort(st);
            selection = new String[st.size()];
            st.toArray(selection);

        }

        @Override
        public int getCount() {
            return Eno.length;
        }

        @Override
        public Object getItem(int position) {
            return Eno[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertview, ViewGroup parent) {

            if (convertview == null) {

                inflater = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);

                convertview = inflater.inflate(R.layout.attendance_list_list, null);

            }
            final holdd jkk = new holdd();

            jkk.tx = (TextView) convertview.findViewById(R.id.stu_name);
            jkk.tx.setText(stu_name[position]);
            jkk.tx2 = (TextView) convertview.findViewById(R.id.E_no);
            jkk.tx2.setText(Eno[position]);
            jkk.im = (ImageView) convertview.findViewById(R.id.imageView33kj);


           if(AP[position]) {
               jkk.im.setImageResource(p);
              // TextView count = (TextView)findViewById(R.id.cuntt);

               //count.setText(Integer.parseInt(count.getText().toString()) + 1);


           }
            else {
               jkk.im.setImageResource(a);


           }




         convertview.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
             //    jkk.im = (ImageView) v.findViewById(R.id.imageView33kj);

                /* jkk.tx = (TextView) v.findViewById(R.id.E_no);

                 Toast.makeText(ctx, jkk.tx.getText().toString(), Toast.LENGTH_SHORT).show();

                 stu_name[position]="f";

*/
            //     jkk.im = (ImageView) v.findViewById(R.id.imageView33kj);
                 Animation select = AnimationUtils.loadAnimation(ctx, R.anim.select);
                 jkk.im.startAnimation(select);
                if(AP[position])
                {

                    TextView tcx =(TextView)((Activity)ctx).findViewById(R.id.tx_total);
                    Integer dj=(Integer.parseInt(count.getText().toString())-1);
                    tcx.setText(dj.toString());

                    new CountDownTimer(200,1) {
                        @Override
                        public void onTick(long ar) { }

                        @Override
                        public void onFinish() {

                            jkk.im.setImageResource(a);
                            AP[position]=false;


                        }
                    }.start();
                }
                 else
                {
                    TextView tcx =(TextView)((Activity)ctx).findViewById(R.id.tx_total);
                    Integer dj=(Integer.parseInt(count.getText().toString())+1);
                    tcx.setText(dj.toString());

                    new CountDownTimer(200,1) {
                    @Override
                    public void onTick(long ar) { }

                    @Override
                    public void onFinish() {

                        jkk.im.setImageResource(p);
                        AP[position]=true;

                    }
                }.start();

                }

             }
         });


            return convertview;


/*
        LinearLayout li = new LinearLayout(ctx);
        li.setOrientation(LinearLayout.VERTICAL);
        TextView tv = new TextView(ctx);
        tv.setText(Eno[position]);
        tv.setTextSize(50);
        tv.setPadding(0,20,0,0);
        li.addView(tv);


        return li;*/

        }

        @Override
        public Object[] getSections() {
            return selection;
        }

        @Override
        public int getPositionForSection(int sectionIndex) {
            return alphaindex.get(selection[sectionIndex]);
        }

        @Override
        public int getSectionForPosition(int position) {
            return 0;

        }


        public class holdd {
            TextView tx, tx2;
            ImageView im;
        }
    }
}