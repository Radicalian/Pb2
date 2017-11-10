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
public class Displae extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaye);
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


    public  void onButtonClick10(View v){
        if(v.getId() == R.id.button10){
            Intent i = new Intent(Displae.this,Displaer.class);
            startActivity(i);
        }
    }
    public  void onButtonClick12(View v){
        if(v.getId() == R.id.button12){
            Intent i = new Intent(Displae.this,displaein.class);
            startActivity(i);
        }
    }
    public  void onButtonClick17(View v){
        if(v.getId() == R.id.button17){
            Intent i = new Intent(Displae.this,displaeat.class);
            startActivity(i);
        }
    }
    public  void onButtonClick11(View v){
        if(v.getId() == R.id.button11){
            Intent i = new Intent(Displae.this,Displael.class);
            startActivity(i);
        }
    }
    public  void onButtonClick13(View v){
        if(v.getId() == R.id.button13){
            Intent i = new Intent(Displae.this,displaemo.class);
            startActivity(i);
        }
    }
}


