package com.example.user.pb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by user on 01-08-2017.
 */

public class Forms extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forms);
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
    public  void onTextView03(View v){
        if(v.getId() == R.id.textView03){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLeHBHY3dQWnljeDA/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView04(View v){
        if(v.getId() == R.id.textView04){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLNy0wemQxc3VzZHc/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView05(View v){
        if(v.getId() == R.id.textView05){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLcXBWTi1zcXBydUE/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView06(View v){
        if(v.getId() == R.id.textView06){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLVXNjVmJjeW9CdTA/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView07(View v){
        if(v.getId() == R.id.textView07){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLdkJfXzhJTFdjV0U/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView08(View v){
        if(v.getId() == R.id.textView08){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLLXc4UWJ1R1BBWXM/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView09(View v){
        if(v.getId() == R.id.textView09){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLajU1SW1SZzhMVjA/view?usp=drivesdk"));
            startActivity(i);
        }
    }
}
