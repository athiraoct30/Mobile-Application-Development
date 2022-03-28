package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText t4,t2,t3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t4=(EditText) findViewById(R.id.t4);
        t2=(EditText) findViewById(R.id.t5);
        t3=(EditText) findViewById(R.id.t6);
        btn=(Button) findViewById(R.id.btn1);
     getSupportActionBar().setTitle("Home");

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name=t4.getText().toString();
                String email=t2.getText().toString();
                String pwd=t3.getText().toString();

                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("Name",name);
                i.putExtra("Email",email);
                i.putExtra("Pwd",pwd);
                startActivity(i);
            }
        });
    }
}