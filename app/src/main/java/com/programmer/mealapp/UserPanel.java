package com.programmer.mealapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserPanel extends AppCompatActivity {

    Button Orders,Categories,Profile,LogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_panel);

        Orders=(Button)findViewById(R.id.btn_orders);
        Categories=(Button)findViewById(R.id.btn_categories);
        Profile=(Button)findViewById(R.id.btn_profile);
        LogOut=(Button)findViewById(R.id.btn_logout);

        Orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UserPanel.this,Orders.class);
                startActivity(i);
            }
        });
        Categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UserPanel.this,Categories.class);
                startActivity(i);
            }
        });
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(UserPanel.this,UserProfile.class);
                startActivity(i);
            }
        });


    }
}
