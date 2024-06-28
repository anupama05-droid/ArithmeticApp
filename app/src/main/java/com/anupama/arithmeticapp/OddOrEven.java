package com.anupama.arithmeticapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OddOrEven extends AppCompatActivity {

    EditText e1;
    AppCompatButton b1,b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_odd_or_even);

        e1=(EditText) findViewById(R.id.number);
        b1=(AppCompatButton) findViewById(R.id.checkbtn);
        b2=(AppCompatButton) findViewById(R.id.backtologinbtn);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String getFnum=e1.getText().toString();
                    int num=Integer.parseInt(getFnum);
                    if (num%2==0)
                        Toast.makeText(getApplicationContext(),"The given number is even",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(),"The given number is odd",Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}