package com.example.dellpc.faculty;

import android.app.Activity;
import android.app.FragmentTransaction;
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
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Student_Detail.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Student_Detail#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Student_Detail extends Fragment  {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private TextView tv_heading_clsswise;
    private TextView tv_stu_detail;
    private LinearLayout lnr_comp12;
    private LinearLayout lnr_comp13;
    private LinearLayout lnr_comp14;
    private LinearLayout lnr_comp15;
    private Button btn_comp12;
    private Button btn_comp13;
    private Button btn_comp14;
    private Button btn_comp15;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Student_Detail.
     */
    // TODO: Rename and change types and number of parameters
    public static Student_Detail newInstance(String param1, String param2) {
        Student_Detail fragment = new Student_Detail();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public Student_Detail() {
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
//        return inflater.inflate(R.layout.fragment_student__detail, container, false);
        View v=  inflater.inflate(R.layout.fragment_student__detail, container, false);
            tv_heading_clsswise =(TextView)v.findViewById(R.id.tv_heading_classwise);

        tv_heading_clsswise.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    tv_heading_clsswise.animate().scaleX((float) 1.1).setDuration(70);
                    tv_heading_clsswise.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    tv_heading_clsswise.animate().scaleX(1).setDuration(70);

                    tv_heading_clsswise.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });
        tv_heading_clsswise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fac_classwise_stu_detail fac_classwise_stu_detail = new Fac_classwise_stu_detail();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.frm_fac, fac_classwise_stu_detail);

                fragmentTransaction.commit();

            }
        });

        return v;
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
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
