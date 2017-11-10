package com.example.user.pb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by user on 12-08-2017.
 */
public class Faq extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);
        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }
    }


        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            if (item.getItemId() == android.R.id.home)
                finish();
            return super.onOptionsItemSelected(item);
        }
    public void onButtonClick31(View v){
        if(v.getId()==R.id.button31) {
            Intent in = new Intent(Faq.this, mobile.class);
            startActivity(in);
        }
        }
    }







