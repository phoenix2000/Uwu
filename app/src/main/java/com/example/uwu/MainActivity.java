package com.example.uwu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import android.widget.Button;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener{
    Button btnA;
    Button btnB;
    TextView txtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnA= (Button)findViewById(R.id.btn1);
        btnB= (Button)findViewById(R.id.btn2);
        txtView=(TextView)findViewById(R.id.TXT);
        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn1)
        {
            txtView.setText("A is clicked");
        }
        if(view.getId()==R.id.btn2)
        {
            txtView.setText("B is clicked");
        }
    }
}
