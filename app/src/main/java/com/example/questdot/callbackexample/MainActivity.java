package com.example.questdot.callbackexample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private DiyToggle mTog;
    private TextView mTvCenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTog = (DiyToggle) findViewById(R.id.mTog);


        //mTog.setBackground(R.mipmap.ic_launcher);

        mTog.setToggleClickListener(new OnToggleClickListener() {
            @Override
            public void onDoClick() {
                Toast.makeText(getApplication(),"Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}