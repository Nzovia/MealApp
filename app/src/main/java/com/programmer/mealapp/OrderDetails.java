package com.programmer.mealapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {
    TextView textitems,textprice;
    String list_choice;
    Double price_Ksh,price_USD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        textitems=(TextView)findViewById(R.id.textitems);
        textprice=(TextView)findViewById(R.id.textprice);

        //getting the passed values from orders
        Bundle bundle=getIntent().getExtras();
        list_choice=bundle.getString("choices");
        price_USD=bundle.getDouble("price");

        textitems.setText(list_choice);
                textprice.setText(price_USD.toString());

    }
}
