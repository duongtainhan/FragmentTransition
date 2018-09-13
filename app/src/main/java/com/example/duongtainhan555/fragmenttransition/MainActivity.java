package com.example.duongtainhan555.fragmenttransition;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        fragmentManager = getSupportFragmentManager();
    }

    public void AddAdnroid(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentAndroid fragmentAndroid = new FragmentAndroid();
        fragmentTransaction.add(R.id.relativeLayout,fragmentAndroid,"fragmentAndroid");
        fragmentTransaction.commit();
    }

    public void AddIOS(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentIOS fragmentIOS = new FragmentIOS();
        fragmentTransaction.add(R.id.relativeLayout,fragmentIOS,"fragmentIOS");
        fragmentTransaction.commit();
    }

    public void ReplaceAndroid(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentAndroid fragmentAndroid = new FragmentAndroid();
        fragmentTransaction.replace(R.id.relativeLayout,fragmentAndroid);
        fragmentTransaction.commit();
    }

    public void ReplaceIOS(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentIOS fragmentIOS = new FragmentIOS();
        fragmentTransaction.replace(R.id.relativeLayout,fragmentIOS);
        fragmentTransaction.commit();
    }

    public void RemoveAndroid(View view) {
        FragmentAndroid fragmentAndroid = (FragmentAndroid) fragmentManager.findFragmentByTag("fragmentAndroid");
        if(fragmentAndroid != null)
        {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragmentAndroid);
            fragmentTransaction.commit();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Khong co!!!", Toast.LENGTH_SHORT).show();
        }
    }

    public void RemoveIOS(View view) {
        FragmentIOS fragmentIOS = (FragmentIOS) fragmentManager.findFragmentByTag("fragmentIOS");
        if(fragmentIOS != null)
        {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragmentIOS);
            fragmentTransaction.commit();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Khong co!!!", Toast.LENGTH_SHORT).show();
        }
    }



}
