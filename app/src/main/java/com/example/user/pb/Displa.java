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
public class Displa extends AppCompatActivity {
    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
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

    public  void onButtonClick5(View v){
        if(v.getId() == R.id.button3){
            Intent i = new Intent(Displa.this,Displai.class);
            startActivity(i);
        }
    }
    public  void onButtonClick6(View v){
        if(v.getId() == R.id.button4){
            Intent i = new Intent(Displa.this,Displaos.class);
            startActivity(i);
        }
    }
    public  void onButtonClick7(View v){
        if(v.getId() == R.id.button5){
            Intent i = new Intent(Displa.this,Displaao.class);
            startActivity(i);
        }
    }
    public  void onButtonClick8(View v){
        if(v.getId() == R.id.button6){
            Intent i = new Intent(Displa.this,Displam.class);
            startActivity(i);
        }
    }
    public  void onButtonClick9(View v){
        if(v.getId() == R.id.button7){
            Intent i = new Intent(Displa.this,Displav.class);
            startActivity(i);
        }
    }
}
