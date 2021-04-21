package com.example.dellpc.faculty;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Attendance.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Attendance#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Attendance extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private TextView tv_attendancelable;
    private Button btn_tdy;
    private Button btn_month;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Attendance.
     */
    // TODO: Rename and change types and number of parameters
    public static Attendance newInstance(String param1, String param2) {
        Attendance fragment = new Attendance();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public Attendance() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_attendance, container, false);

        View v=  inflater.inflate(R.layout.fragment_attendance, container, false);

        btn_tdy = (Button) v.findViewById(R.id.btn_tdy);
        btn_month = (Button) v.findViewById(R.id.btn_month);

        btn_tdy.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    btn_tdy.animate().scaleX((float) 1.1).setDuration(70);
                    btn_tdy.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    btn_tdy.animate().scaleX(1).setDuration(70);

                    btn_tdy.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });

        btn_tdy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Stu_today_attendance.class);
                startActivity(i);

            }
        });
        btn_month.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    btn_month.animate().scaleX((float) 1.1).setDuration(70);
                    btn_month.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    btn_month.animate().scaleX(1).setDuration(70);

                    btn_month.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });
        btn_month.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Stu_monthly_attendance.class);
                startActivity(i);
            }
        });

        return  v;
   //     listview = (ListView)v.findViewById(R.id.lstview);
     //   listView.setAdapter(new CustomListAdapter(this));

 //    listview = (ListView)v.findViewById(R.id.lstview);
//        ArrayList<String> arrayString = new ArrayList<String>();
//        arrayString.add("---Select Any One--");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        arrayString.add("shruti");
//        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,arrayString);
//        listview.setAdapter(adapter);


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
