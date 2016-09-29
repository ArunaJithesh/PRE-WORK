package com.example.aruna.foodapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public int riceCalaories=200;
    public int oats=600;
    public int milk=148;
    public int cerals=307;
    public int egg=70;
    public int bannana=218;
    public int sprouts=60;
    public int total=0;
    public  RadioButton radiobutton1;
    public  RadioButton radiobutton2;
    public  RadioButton radiobutton3;
    public RadioButton radiobutton4;
    public RadioButton radiobutton5;
    public RadioButton radiobutton6;
    public RadioButton radiobutton7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button button=(Button)findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                goToActivity();
            }
        });
        Button button1=(Button)findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                goToReset();
            }
        });
                radiobutton1=(RadioButton)findViewById(R.id.radioButton);
                radiobutton1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        goToButtonClick(radiobutton1);
                    }
                });
                radiobutton2=(RadioButton)findViewById(R.id.radioButton3);
                radiobutton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        goToButtonClick(radiobutton2);
                    }
                });
                 radiobutton3=(RadioButton)findViewById(R.id.radioButton4);
                 radiobutton3.setOnClickListener(new View.OnClickListener() {
                     @Override
                      public void onClick(View view) {
                          goToButtonClick(radiobutton3);
                      }
                 });
                 radiobutton4=(RadioButton)findViewById(R.id.radioButton5);
                 radiobutton4.setOnClickListener(new View.OnClickListener() {
                      @Override
                       public void onClick(View view) {
                           goToButtonClick(radiobutton4);
                       }
                 });
                 radiobutton5=(RadioButton)findViewById(R.id.radioButton6);
                 radiobutton5.setOnClickListener(new View.OnClickListener() {
                       @Override
                        public void onClick(View view) {
                            goToButtonClick(radiobutton5);
                        }
                 });
                 radiobutton6=(RadioButton)findViewById(R.id.radioButton7);
                 radiobutton6.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
                              goToButtonClick(radiobutton6);
                         }
                 });
                 radiobutton7=(RadioButton)findViewById(R.id.radioButton8);
                 radiobutton7.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
                              goToButtonClick(radiobutton7);
                         }
                 });
            }

    public void goToButtonClick(RadioButton radio)
    {
        switch (radio.getId())
        {
            case R.id.radioButton:
                total=total+riceCalaories;
                break;
            case R.id.radioButton3:
                total=total+oats;
                break;
            case R.id.radioButton4:
                total=total+milk;
                break;
            case R.id.radioButton5:
                total=total+cerals;
                break;
            case R.id.radioButton6:
                total=total+egg;
                break;
            case R.id.radioButton7:
                total=total+bannana;
                break;
            case R.id.radioButton8:
                total=total+sprouts;
                break;
        }

    }
    public void goToActivity()
    {
        TextView textview=(TextView)findViewById(R.id.textView);
        textview.setText(String.valueOf(total));
        TextView textview1=(TextView)findViewById(R.id.textView4);
        if(total>500) {
            textview1.setText("Control the calorie intake,Ideal rate is 500");
        }
        else if(total<350)
        {
            textview1.setText("you won’t get enough energy to boost your metabolism");
        }
        else if((total<500)&&(total>350))
        {
            textview1.setText("Go Head.....You have correct breakfast");
        }
        }
    public void goToReset()
    {
         radiobutton1=(RadioButton)findViewById(R.id.radioButton);
         radiobutton2=(RadioButton)findViewById(R.id.radioButton3);
         radiobutton3=(RadioButton)findViewById(R.id.radioButton4);
         radiobutton4=(RadioButton)findViewById(R.id.radioButton5);
         radiobutton5=(RadioButton)findViewById(R.id.radioButton6);
         radiobutton6=(RadioButton)findViewById(R.id.radioButton7);
         radiobutton7=(RadioButton)findViewById(R.id.radioButton8);
        radiobutton1.setChecked(false);
        radiobutton2.setChecked(false);
        radiobutton3.setChecked(false);
        radiobutton4.setChecked(false);
        radiobutton5.setChecked(false);
        radiobutton6.setChecked(false);
        radiobutton7.setChecked(false);
        TextView textview=(TextView)findViewById(R.id.textView);
        textview.setText("");
        TextView textview1=(TextView)findViewById(R.id.textView4);
        textview1.setText("");
        total=0;
    }


}
