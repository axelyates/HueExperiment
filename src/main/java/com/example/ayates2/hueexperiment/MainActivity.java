package com.example.ayates2.hueexperiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListener();
    }

    public void OnClickButtonListener(){

        button_submit = (Button)findViewById(R.id.button_to_activity_2);
        button_submit.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent i = new Intent("com.example.ayates2.hueexperiment.Main2Activity");
                    startActivity(i);
                }
            }
        );
    }
}
