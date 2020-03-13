package com.programmer.mealapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button nButtonLogin;
    TextView nTextViewSignup;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= (EditText) findViewById(R.id.edittext_username);
        password=(EditText)findViewById(R.id.edittext_password);
        nButtonLogin=(Button)findViewById(R.id.btn_login);
        databaseHelper=new DatabaseHelper(this);

        nButtonLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String UsernameValue=username.getText().toString();
                String passwordValue=password.getText().toString();

                if (!databaseHelper.isLoginValid(UsernameValue,passwordValue)) {
                    Toast.makeText(MainActivity.this,"Invalid credentials",Toast.LENGTH_SHORT
                    ).show();
                } else {

                    Intent u=new Intent(MainActivity.this,UserPanel.class);
                    startActivity(u);
                    Toast.makeText(MainActivity.this,"Login successful",Toast.LENGTH_SHORT
                    ).show();
                }


            }
        });
        nTextViewSignup=(TextView)findViewById(R.id.textview_signup);
        //listener onclick
        nTextViewSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SignUp.class);
                startActivity(i);

                                               }
                                           }
        );
    }
}
