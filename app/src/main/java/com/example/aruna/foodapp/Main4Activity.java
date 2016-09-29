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

public class Main4Activity extends AppCompatActivity {
    public int chappathy=400;
    public int chicken=270;
    public int vegetable=59;
    public int milk=148;
    public int egg=70;
    public int rice=200;
    public int fruit=100;
    public int cerals=307;
    public int total;
    public RadioButton radiobutton1;
    public RadioButton radiobutton2;
    public RadioButton radiobutton3;
    public RadioButton radiobutton4;
    public RadioButton radiobutton5;
    public RadioButton radiobutton6;
    public RadioButton radiobutton7;
    public RadioButton radiobutton8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
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
        Button button=(Button)findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                goToActivity();
            }
        });
        Button button1=(Button)findViewById(R.id.button9);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                goToReset();
            }
        });
        radiobutton1=(RadioButton)findViewById(R.id.radioButton16);
        radiobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton1);
            }
        });
        radiobutton2=(RadioButton)findViewById(R.id.radioButton17);
        radiobutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton2);
            }
        });
        radiobutton3=(RadioButton)findViewById(R.id.radioButton18);
        radiobutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton3);
            }
        });
        radiobutton4=(RadioButton)findViewById(R.id.radioButton20);
        radiobutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton4);
            }
        });
        radiobutton5=(RadioButton)findViewById(R.id.radioButton21);
        radiobutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton5);
            }
        });
        radiobutton6=(RadioButton)findViewById(R.id.radioButton22);
        radiobutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton6);
            }
        });
        radiobutton7=(RadioButton)findViewById(R.id.radioButton23);
        radiobutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton7);
            }
        });
        radiobutton8=(RadioButton)findViewById(R.id.radioButton24);
        radiobutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton8);
            }
        });
    }
    public void goToButtonClick(RadioButton radio)
    {
        switch (radio.getId())
        {
            case R.id.radioButton16:
                total=total+chappathy;
                break;
            case R.id.radioButton17:
                total=total+chicken;
                break;
            case R.id.radioButton18:
                total=total+vegetable;
                break;
            case R.id.radioButton20:
                total=total+milk;
                break;
            case R.id.radioButton21:
                total=total+egg;
                break;
            case R.id.radioButton22:
                total=total+rice;
                break;
            case R.id.radioButton23:
                total=total+fruit;
                break;
            case R.id.radioButton24:
                total=total+cerals;
                break;
        }

    }
    public void goToActivity()
    {
        TextView textview=(TextView)findViewById(R.id.textView5);
        textview.setText(String.valueOf(total));
        TextView textview1=(TextView)findViewById(R.id.textView6);
        if(total>500) {
            textview1.setText("Control the calorie intake,Ideal rate is 500");
        }
        else if(total<350)
        {
            textview1.setText("you won’t get enough energy to boost your metabolism");
        }
        else if((total<500)&&(total>350))
        {
            textview1.setText("Go Head.....You have correct Dinner");
        }
    }
    public void goToReset()
    {
        radiobutton1=(RadioButton)findViewById(R.id.radioButton16);
        radiobutton2=(RadioButton)findViewById(R.id.radioButton17);
        radiobutton3=(RadioButton)findViewById(R.id.radioButton18);
        radiobutton4=(RadioButton)findViewById(R.id.radioButton20);
        radiobutton5=(RadioButton)findViewById(R.id.radioButton21);
        radiobutton6=(RadioButton)findViewById(R.id.radioButton22);
        radiobutton7=(RadioButton)findViewById(R.id.radioButton23);
        radiobutton8=(RadioButton)findViewById(R.id.radioButton24);
        radiobutton1.setChecked(false);
        radiobutton2.setChecked(false);
        radiobutton3.setChecked(false);
        radiobutton4.setChecked(false);
        radiobutton5.setChecked(false);
        radiobutton6.setChecked(false);
        radiobutton7.setChecked(false);
        radiobutton8.setChecked(false);
        TextView textview=(TextView)findViewById(R.id.textView5);
        textview.setText("");
        TextView textview1=(TextView)findViewById(R.id.textView6);
        textview1.setText("");
        total=0;
    }

}
