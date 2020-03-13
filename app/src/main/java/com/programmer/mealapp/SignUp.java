package com.programmer.mealapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText Username,Mobilenumber,Password;
    Button Signup;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Username= (EditText) findViewById(R.id.edittext_username);
        Mobilenumber=(EditText)findViewById(R.id.mobile_number);
        Password=(EditText)findViewById(R.id.edittext_password);
        Signup=(Button)findViewById(R.id.btn_register);

        final DatabaseHelper databaseHelper=new DatabaseHelper(this);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UsernameValue=Username.getText().toString();
                String MobilenumberValue=Mobilenumber.getText().toString();
                String passwordValue=Password.getText().toString();


                if(UsernameValue.length()>1){
                    ContentValues contentValues=new ContentValues();
                    contentValues.put("username",UsernameValue);
                    contentValues.put("mobilenumber",MobilenumberValue);
                    contentValues.put("password",passwordValue);

                    databaseHelper.insertUser(contentValues);

                    Toast.makeText(SignUp.this,"registration successful,remember details",Toast.LENGTH_SHORT
                    ).show();
                    Intent u=new Intent(SignUp.this,MainActivity.class);
                    startActivity(u);


                }
                else{
                    Toast.makeText(SignUp.this,"registration failed",Toast.LENGTH_SHORT
                    ).show();
                }


            }
        });
    }
}
