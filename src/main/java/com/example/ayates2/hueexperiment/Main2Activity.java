package com.example.ayates2.hueexperiment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button button_submit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        OnClickButtonListener();
    }

    public void OnClickButtonListener(){

        button_submit2 = (Button)findViewById(R.id.button_to_activity_1);
        button_submit2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        finish();
                    }
                }
        );
    }


}
