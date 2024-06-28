package com.anupama.arithmeticapp;

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

public class Largestnum extends AppCompatActivity {

    EditText e1,e2;
    AppCompatButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_largestnum);

        e1=(EditText) findViewById(R.id.Fnum);
        e2=(EditText) findViewById(R.id.Snum);
        b1=(AppCompatButton) findViewById(R.id.findbtn);
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
                    String getSnum=e2.getText().toString();
                    int num1=Integer.parseInt(getFnum);
                    int num2=Integer.parseInt(getSnum);
                    if (num1>num2)
                        Toast.makeText(getApplicationContext(),String.valueOf(num1),Toast.LENGTH_LONG).show();
                    else if(num2>num1)
                        Toast.makeText(getApplicationContext(),String.valueOf(num2),Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getApplicationContext(),"Numbers are equal",Toast.LENGTH_LONG).show();

                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}