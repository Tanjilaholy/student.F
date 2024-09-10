package com.example.signuplogin;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class homeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);


        CardView classroutineCard=view.findViewById(R.id.classroutineCard);
        CardView classCard=view.findViewById(R.id.classCard);
        CardView waiverCard=view.findViewById(R.id.waiverCard);
        CardView semesterCard=view.findViewById(R.id.semesterCard);
        CardView resultCard=view.findViewById(R.id.resultCard);
        CardView scheduleCard=view.findViewById(R.id.scheduleCard);


        classroutineCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoutineFragment routineFragment=new RoutineFragment();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,routineFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        classCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AcademicFragment academicFragment=new AcademicFragment();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,academicFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        waiverCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               WaiverFragment waiverFragment=new WaiverFragment();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,waiverFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        semesterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegistrationFragment registrationFragment=new RegistrationFragment();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,registrationFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        resultCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultFragment resultFragment=new ResultFragment();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,resultFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        scheduleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScheduleFragment scheduleFragment=new ScheduleFragment();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container,scheduleFragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        return view;
    }
}