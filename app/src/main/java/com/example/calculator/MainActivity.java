package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Add(View v){
        EditText fno =(EditText) findViewById(R.id.fno);
        EditText sno =(EditText) findViewById(R.id.sno);

        int no1 = Integer.parseInt(fno.getText().toString());
        int no2 = Integer.parseInt(sno.getText().toString());
        int result = no1+no2;

        Toast.makeText(this, "The sum of two numbers is "+result, Toast.LENGTH_SHORT).show();
    }
    public void Sub(View v) {
        EditText fno = (EditText) findViewById(R.id.fno);
        EditText sno = (EditText) findViewById(R.id.sno);

        int no1 = Integer.parseInt(fno.getText().toString());
        int no2 = Integer.parseInt(sno.getText().toString());
        int result = no1 - no2;

        Toast.makeText(this, "The substraction of two numbers is "+result, Toast.LENGTH_SHORT).show();
    }
    public void Mult(View v){
        EditText fno =(EditText) findViewById(R.id.fno);
        EditText sno =(EditText) findViewById(R.id.sno);

        int no1 = Integer.parseInt(fno.getText().toString());
        int no2 = Integer.parseInt(sno.getText().toString());
        int result = no1*no2;

        Toast.makeText(this, "The multiplication of two numbers is "+result, Toast.LENGTH_SHORT).show();
    }
    public void Div(View v){
        EditText fno =(EditText) findViewById(R.id.fno);
        EditText sno =(EditText) findViewById(R.id.sno);

        int no1 = Integer.parseInt(fno.getText().toString());
        int no2 = Integer.parseInt(sno.getText().toString());
        int result = no1/no2;

        Toast.makeText(this, "The division of two number is "+result, Toast.LENGTH_SHORT).show();
    }
}