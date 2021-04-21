package com.example.dellpc.faculty;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fac_Time_table_display.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fac_Time_table_display#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fac_Time_table_display extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private View v;
    private int i;
    private Button btn_whole;
    private Button btn_class;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fac_Time_table_display.
     */
    // TODO: Rename and change types and number of parameters
    public static Fac_Time_table_display newInstance(String param1, String param2) {
        Fac_Time_table_display fragment = new Fac_Time_table_display();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public Fac_Time_table_display() {
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
        v= inflater.inflate(R.layout.fragment_fac__time_table_display, container, false);
        ImageView logo_img =(ImageView) v.findViewById(R.id.logo_imgg);

        RelativeLayout rt =(RelativeLayout) v.findViewById(R.id.option_lay1);
        rt.animate().translationX(500);


        logo_img.animate().scaleX(5);
        logo_img.animate().scaleY(5);
        new CountDownTimer(500,1) {
            @Override
            public void onTick(long ar) {

            }

            @Override
            public void onFinish() {

                //	 Intent intentToBePassedToNextActivity = new Intent(getBaseContext(),Home.class);
                //	startActivity(intentToBePassedToNextActivity);
                //overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
                //	MainActivity.this.finish();
                //	overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
                ImageView logo_img =(ImageView) v.findViewById(R.id.logo_imgg);

                logo_img.setVisibility(View.VISIBLE);
                logo_img.animate().scaleX((float) 1);
                logo_img.animate().scaleY((float) 1);


                new CountDownTimer(1000,1) {
                    @Override
                    public void onTick(long ar) {

                    }

                    @Override
                    public void onFinish() {

                        //	 Intent intentToBePassedToNextActivity = new Intent(getBaseContext(),Home.class);
                        //	startActivity(intentToBePassedToNextActivity);
                        //overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
                        //	MainActivity.this.finish();
                        //	overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
                        RelativeLayout rt =(RelativeLayout) v.findViewById(R.id.option_lay1);

                        rt.setVisibility(View.VISIBLE);
                        rt.animate().translationX(0);

                    }

                }.start();

            }

        }.start();



//        final ImageView sff =(ImageView)v.findViewById(R.id.staff_ck);
//        final ImageView stu =(ImageView)v.findViewById(R.id.stu_ck);
        btn_class = (Button) v.findViewById(R.id.btn_class);
        btn_whole = (Button)v.findViewById(R.id.btn_whole);
        btn_class.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

             Intent i = new Intent(getActivity(),Class_tme_table_fac.class);
                startActivity(i);

            }
        });

        btn_whole.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

               Intent i = new Intent(getActivity(),Whole_time_table.class);
                startActivity(i);

            }
        });

        btn_class.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if (arg1.getAction() == MotionEvent.ACTION_DOWN) {

                    btn_class.animate().scaleX((float) 1.1).setDuration(70);
                    btn_class.animate().scaleY((float) 1.1).setDuration(70);


                } else if (arg1.getAction() == MotionEvent.ACTION_UP) {

                    btn_class.animate().scaleX(1).setDuration(70);
                    btn_class.animate().scaleY(1).setDuration(70);


                }

                return false;
            }
        });

        Animation rotation = AnimationUtils.loadAnimation(getActivity(), R.anim.test);
        rotation.setRepeatCount(Animation.INFINITE);
        btn_class.startAnimation(rotation);



        btn_whole.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                // TODO Auto-generated method stub

                if(arg1.getAction() == MotionEvent.ACTION_DOWN)
                {

                    btn_whole.animate().scaleX((float) 1.1).setDuration(70);
                    btn_whole.animate().scaleY((float) 1.1).setDuration(70);



                }


                else if(arg1.getAction() == MotionEvent.ACTION_UP)
                {

                    btn_whole.animate().scaleX(1).setDuration(70);
                    btn_whole.animate().scaleY(1).setDuration(70);





                }

                return false;
            }
        });
        btn_whole.startAnimation(rotation);
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//        try {
//            mListener = (OnFragmentInteractionListener) activity;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(activity.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }

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
