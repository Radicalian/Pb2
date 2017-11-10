
package com.example.user.pb;



import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Timer;
import java.util.TimerTask;

import static com.example.user.pb.R.id.textView;

import static com.example.user.pb.R.id.viewPager;

public class ProfileActivity extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener {
    CustomPagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;
    //firebase auth object
    private FirebaseAuth firebaseAuth;

    //view objects

    private Button buttonLogout;

     TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
      ;
       final MediaPlayer mMediaPlayer=MediaPlayer.create(this,R.raw.mp31);


        mMediaPlayer.start();
        CountDownTimer Timer = new CountDownTimer(3200,3200) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
if(mMediaPlayer.isPlaying()){
    mMediaPlayer.stop();
    mMediaPlayer.release();
}
            }
        };
        Timer.start();


        tv = (TextView) findViewById(R.id.textView99);
        tv.setSelected(true);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);


        mCustomPagerAdapter = new CustomPagerAdapter(this);
        mViewPager = (ViewPager) findViewById(viewPager);
        mViewPager.setAdapter(mCustomPagerAdapter);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);


        //initializing firebase authentication object
        firebaseAuth = FirebaseAuth.getInstance();

        //if the user is not logged in
        //that means current user will return null

        //getting current user
        FirebaseUser user = firebaseAuth.getCurrentUser();

        //initializing views



    }


    public class MyTimerTask extends TimerTask {

        @Override
        public void run(){
            ProfileActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(mViewPager.getCurrentItem() == 0){
                        mViewPager.setCurrentItem(1);

                    } else if(mViewPager.getCurrentItem() == 1){
                        mViewPager.setCurrentItem(2);

                    } else if(mViewPager.getCurrentItem() == 2){
                        mViewPager.setCurrentItem(3);

                    }else if(mViewPager.getCurrentItem() == 3){
                        mViewPager.setCurrentItem(4);

                    }else if(mViewPager.getCurrentItem() == 4){
                        mViewPager.setCurrentItem(5);

                    }else if(mViewPager.getCurrentItem() == 5){
                        mViewPager.setCurrentItem(6);

                    }
                    else if(mViewPager.getCurrentItem() == 6){
                        mViewPager.setCurrentItem(7);

                    }else if(mViewPager.getCurrentItem() == 7){
                        mViewPager.setCurrentItem(0);

                    }
                }
            });
        }

    }
    public  void onButtonClick(View v){
        if(v.getId() == R.id.button2){
            Intent i = new Intent(ProfileActivity.this,Displa.class);
            startActivity(i);
        }
    }
    public  void onButtonClick280(View v){
        if(v.getId() == R.id.button280){
            Intent i = new Intent(ProfileActivity.this,Products.class);
            startActivity(i);
        }
    }
    public  void onButtonClick2(View v){
        if(v.getId() == R.id.button8){
            Intent i = new Intent(ProfileActivity.this,Displae.class);
            startActivity(i);
        }
    }
    public  void onButtonClick28(View v){
        if(v.getId() == R.id.button28){
            Intent i = new Intent(ProfileActivity.this,Forms.class);
            startActivity(i);
        }
    }
    public  void onButtonClick3(View v){
        if(v.getId() == R.id.button14){
            Intent i = new Intent(ProfileActivity.this,Displaee.class);
            startActivity(i);
        }
    }
    public  void onButtonClick4(View v){
        if(v.getId() == R.id.button18){
            Intent i = new Intent(ProfileActivity.this,Displaeee.class);
            startActivity(i);
        }
    }

    public  void onButtonClick27(View v){
        if(v.getId() == R.id.button27){
            Intent i = new Intent(ProfileActivity.this,Intrest.class);
            startActivity(i);
        }
    }

    public  void onTextView38(View v){
        if(v.getId() == R.id.textView38){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLSkd3Q21IR0t2R3c/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView39(View v){
        if(v.getId() == R.id.textView39){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLOTVXem1iY1R4MFU/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView40(View v){
        if(v.getId() == R.id.textView40){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLZmZGM1ZmMzh0ZUk/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView41(View v){
        if(v.getId() == R.id.textView41){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLaW5NdUxUM2VPajQ/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView42(View v){
        if(v.getId() == R.id.textView42){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLMm9ObzdRcXdYa1k/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView43(View v){
        if(v.getId() == R.id.textView43){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLNEFRWkRKc09VcEE/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView44(View v){
        if(v.getId() == R.id.textView44){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLWEotMnBiRkw4NHc/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView45(View v){
        if(v.getId() == R.id.textView45){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://drive.google.com/file/d/0B5LvztJKnkGLdHJtOTVHbEtvblE/view?usp=drivesdk"));
            startActivity(i);
        }
    }
    public  void onTextView46(View v){
        if(v.getId() == R.id.textView46){
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("https://drive.google.com/file/d/0B5LvztJKnkGLeFRSclNBZElvd1k/view?usp=drivesdk"));
            startActivity(i);
        }
    }





    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
        builder.setMessage("Do you really want to exit this app?");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
finish();
            }
        });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch(id){
            case R.id.settings:
                Intent i= new Intent(ProfileActivity.this,settings.class);
                startActivity(i);
                break;
            case R.id.holiday:
                Intent a= new Intent(ProfileActivity.this,holiday.class);
                startActivity(a);
                break;
        }


        return super.onOptionsItemSelected(item);
    }






    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
int id=item.getItemId();
        switch(id){
            case R.id.info:
                Intent i = new Intent(ProfileActivity.this,info.class);
                startActivity(i);
                break;
            case R.id.tools:
                Intent g = new Intent(ProfileActivity.this,gallery.class);
                startActivity(g);
                break;
            case R.id.developer:
                Intent d = new Intent(ProfileActivity.this,developer.class);
                startActivity(d);
                break;
            case R.id.share:
                Intent s = new Intent(ProfileActivity.this,share.class);
                startActivity(s);
                break;
            case R.id.contact:
                Intent c = new Intent(ProfileActivity.this,contact.class);
                startActivity(c);
                break;
            case R.id.faq:
                Intent q= new Intent(ProfileActivity.this,Faq.class);
                startActivity(q);
                break;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}




