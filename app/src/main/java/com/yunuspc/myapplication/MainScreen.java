package com.yunuspc.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }


    public void goToFirst(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        firstfragment firstfragment = new firstfragment();
        //fragmentTransaction.add(R.id.frame_layout,firstfragment).commit();
        fragmentTransaction.replace(R.id.frame_layout, firstfragment).commit();


    }

    public void goToSecond(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        secondfragment secondfragment = new secondfragment();
        //fragmentTransaction.add(R.id.frame_layout,secondfragment).commit();
        fragmentTransaction.replace(R.id.frame_layout, secondfragment).commit();

    }

    public void goToThird(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        thirdfragment thirdfragment = new thirdfragment();
        //fragmentTransaction.add(R.id.frame_layout,secondfragment).commit();
        fragmentTransaction.replace(R.id.frame_layout, thirdfragment).commit();


    }

    public void goToFourth(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fourthfragment fourthfragment = new fourthfragment();
        //fragmentTransaction.add(R.id.frame_layout,th).commit();
        fragmentTransaction.replace(R.id.frame_layout, fourthfragment).commit();

    }
}