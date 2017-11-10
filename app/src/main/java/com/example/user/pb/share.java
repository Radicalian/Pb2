package com.example.user.pb;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by user on 09-07-2017.
 */

public class share extends AppCompatActivity{

Button button26;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.share);
            button26=(Button)findViewById(R.id.button26);
            button26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    String shareBody ="Link will be generated when app will be live on playstore ";
                    String shareSub= "Download official Purvanchal Bank Mobile App from the link given below:";
                    intent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                    intent.putExtra(Intent.EXTRA_TEXT,shareBody);
                    startActivity(Intent.createChooser(intent,"Share using"));

                }
            });
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
        }





