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

public class Main3Activity extends AppCompatActivity {

    public int riceCalaories=400;
    public int salads=200;
    public int burger=200;
    public int chicken=270;
    public int fish=300;
    public int beefandpork=200;
    public int egg=70;
    public int fruits=100;
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
        setContentView(R.layout.activity_main3);
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
        Button button=(Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                goToActivity();
            }
        });
        Button button1=(Button)findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                goToReset();
            }
        });
        radiobutton1=(RadioButton)findViewById(R.id.radioButton2);
        radiobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton1);
            }
        });
        radiobutton2=(RadioButton)findViewById(R.id.radioButton9);
        radiobutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton2);
            }
        });
        radiobutton3=(RadioButton)findViewById(R.id.radioButton10);
        radiobutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton3);
            }
        });
        radiobutton4=(RadioButton)findViewById(R.id.radioButton11);
        radiobutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton4);
            }
        });
        radiobutton5=(RadioButton)findViewById(R.id.radioButton12);
        radiobutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton5);
            }
        });
        radiobutton6=(RadioButton)findViewById(R.id.radioButton13);
        radiobutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton6);
            }
        });
        radiobutton7=(RadioButton)findViewById(R.id.radioButton14);
        radiobutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToButtonClick(radiobutton7);
            }
        });
        radiobutton8=(RadioButton)findViewById(R.id.radioButton15);
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
            case R.id.radioButton2:
                total=total+riceCalaories;
                break;
            case R.id.radioButton9:
                total=total+salads;
                break;
            case R.id.radioButton10:
                total=total+burger;
                break;
            case R.id.radioButton11:
                total=total+chicken;
                break;
            case R.id.radioButton12:
                total=total+fish;
                break;
            case R.id.radioButton13:
                total=total+beefandpork;
                break;
            case R.id.radioButton14:
                total=total+egg;
                break;
            case R.id.radioButton15:
                total=total+fruits;
                break;
        }

    }
    public void goToActivity()
    {
        TextView textview=(TextView)findViewById(R.id.textView3);
        textview.setText(String.valueOf(total));
        TextView textview1=(TextView)findViewById(R.id.textView2);
        if(total>400) {
            textview1.setText("Control the calorie intake,Ideal rate is 400");
        }
        else if(total<250)
        {
            textview1.setText("you won’t get enough energy to boost your metabolism");
        }
        else if((total<400)&&(total>250))
        {
            textview1.setText("Go Head.....You have correct Lunch");
        }
    }
    public void goToReset()
    {
        radiobutton1=(RadioButton)findViewById(R.id.radioButton2);
        radiobutton2=(RadioButton)findViewById(R.id.radioButton9);
        radiobutton3=(RadioButton)findViewById(R.id.radioButton10);
        radiobutton4=(RadioButton)findViewById(R.id.radioButton11);
        radiobutton5=(RadioButton)findViewById(R.id.radioButton12);
        radiobutton6=(RadioButton)findViewById(R.id.radioButton13);
        radiobutton7=(RadioButton)findViewById(R.id.radioButton14);
        radiobutton8=(RadioButton)findViewById(R.id.radioButton15);
        radiobutton1.setChecked(false);
        radiobutton2.setChecked(false);
        radiobutton3.setChecked(false);
        radiobutton4.setChecked(false);
        radiobutton5.setChecked(false);
        radiobutton6.setChecked(false);
        radiobutton7.setChecked(false);
        radiobutton8.setChecked(false);
        TextView textview=(TextView)findViewById(R.id.textView3);
        textview.setText("");
        TextView textview1=(TextView)findViewById(R.id.textView2);
        textview1.setText("");
        total=0;
    }
}
