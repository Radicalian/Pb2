package com.example.user.pb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by user on 26-06-2017.
 */
public class Displaee extends AppCompatActivity{
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayee);
        if(getSupportActionBar()!=null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    public  void onButtonClick15(View v){
        if(v.getId() == R.id.button15){
            Intent i = new Intent(Displaee.this,Displaeer.class);
            startActivity(i);
        }
    }
    public  void onButtonClick16(View v){
        if(v.getId() == R.id.button16){
            Intent i = new Intent(Displaee.this,displaeed.class);
            startActivity(i);
        }
    }}
