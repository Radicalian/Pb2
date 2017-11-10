package com.example.user.pb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by user on 05-08-2017.
 */
public class Products extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products);
        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


    public void onButtonClick34(View v) {
        if (v.getId() == R.id.button34) {
            Intent i = new Intent(Products.this, Current.class);
            startActivity(i);
        }
    }

    public void onButtonClick35(View v) {
        if (v.getId() == R.id.button35) {
            Intent i = new Intent(Products.this, Savings.class);
            startActivity(i);
        }
    }
    public void onButtonClick36(View v) {
        if (v.getId() == R.id.button36) {
            Intent i = new Intent(Products.this, Specials.class);
            startActivity(i);
        }
    }
    public void onButtonClick37(View v) {
        if (v.getId() == R.id.button37) {
            Intent i = new Intent(Products.this, Multi.class);
            startActivity(i);
        }
    }
    public void onButtonClick38(View v) {
        if (v.getId() == R.id.button38) {
            Intent i = new Intent(Products.this, Reccuring.class);
            startActivity(i);
        }
    }
    public void onButtonClick39(View v) {
        if (v.getId() == R.id.button39) {
            Intent i = new Intent(Products.this, Terms.class);
            startActivity(i);
        }
        }
    public void onButtonClick40(View v) {
        if (v.getId() == R.id.button40) {
            Intent i = new Intent(Products.this, Kcc.class);
            startActivity(i);
        }
    }
    public void onButtonClick41(View v) {
        if (v.getId() == R.id.button41) {
            Intent i = new Intent(Products.this, Tractor.class);
            startActivity(i);
        }
    }
    public void onButtonClick42(View v) {
        if (v.getId() == R.id.button42) {
            Intent i = new Intent(Products.this, Combine.class);
            startActivity(i);
        }
    }
    public void onButtonClick43(View v) {
        if (v.getId() == R.id.button43) {
            Intent i = new Intent(Products.this, Finance.class);
            startActivity(i);
        }
    }
    public void onButtonClick44(View v) {
        if (v.getId() == R.id.button44) {
            Intent i = new Intent(Products.this, Saghan.class);
            startActivity(i);
        }
    }
    public void onButtonClick45(View v) {
        if (v.getId() == R.id.button45) {
            Intent i = new Intent(Products.this, Poultry.class);
            startActivity(i);
        }
    }
    public void onButtonClick46(View v) {
        if (v.getId() == R.id.button46) {
            Intent i = new Intent(Products.this, Loan.class);
            startActivity(i);
        }
    }
    public void onButtonClick47(View v) {
        if (v.getId() == R.id.button47) {
            Intent i = new Intent(Products.this, Agri.class);
            startActivity(i);
        }
    }
    public void onButtonClick48(View v) {
        if (v.getId() == R.id.button48) {
            Intent i = new Intent(Products.this, Solar.class);
            startActivity(i);
        }
    }
    public void onButtonClick49(View v) {
        if (v.getId() == R.id.button49) {
            Intent i = new Intent(Products.this, Working.class);
            startActivity(i);
        }
    }
    public void onButtonClick50(View v) {
        if (v.getId() == R.id.button50) {
            Intent i = new Intent(Products.this, Public.class);
            startActivity(i);
        }
    }
    public void onButtonClick51(View v) {
        if (v.getId() == R.id.button51) {
            Intent i = new Intent(Products.this, Doctor.class);
            startActivity(i);
        }
    }
    public void onButtonClick52(View v) {
        if (v.getId() == R.id.button52) {
            Intent i = new Intent(Products.this, Concessional.class);
            startActivity(i);
        }
    }public void onButtonClick53(View v) {
        if (v.getId() == R.id.button53) {
            Intent i = new Intent(Products.this, Home.class);
            startActivity(i);
        }
    }
    public void onButtonClick54(View v) {
        if (v.getId() == R.id.button54) {
            Intent i = new Intent(Products.this, Weaver.class);
            startActivity(i);
        }
    }
    public void onButtonClick55(View v) {
        if (v.getId() == R.id.button55) {
            Intent i = new Intent(Products.this, Rent.class);
            startActivity(i);
        }
    }
    public void onButtonClick56(View v) {
        if (v.getId() == R.id.button56) {
            Intent i = new Intent(Products.this, Pensioner.class);
            startActivity(i);
        }
    }
    public void onButtonClick57(View v) {
        if (v.getId() == R.id.button57) {
            Intent i = new Intent(Products.this, Debt.class);
            startActivity(i);
        }
    }
    public void onButtonClick58(View v) {
        if (v.getId() == R.id.button58) {
            Intent i = new Intent(Products.this, General.class);
            startActivity(i);
        }
    }
    public void onButtonClick59(View v) {
        if (v.getId() == R.id.button59) {
            Intent i = new Intent(Products.this, Mukhyamantri.class);
            startActivity(i);
        }
    }
    public void onButtonClick60(View v) {
        if (v.getId() == R.id.button60) {
            Intent i = new Intent(Products.this, Bank.class);
            startActivity(i);
        }
    }
    public void onButtonClick61(View v) {
        if (v.getId() == R.id.button61) {
            Intent i = new Intent(Products.this, Mortgage.class);
            startActivity(i);
        }
    }
    public void onButtonClick62(View v) {
        if (v.getId() == R.id.button62) {
            Intent i = new Intent(Products.this, fourwheeler.class);
            startActivity(i);
        }
    }
    public void onButtonClick63(View v) {
        if (v.getId() == R.id.button63) {
            Intent i = new Intent(Products.this, grahak.class);
            startActivity(i);
        }
    }
    public void onButtonClick64(View v) {
        if (v.getId() == R.id.button64) {
            Intent i = new Intent(Products.this, pbteacher.class);
            startActivity(i);
        }
    }
    public void onButtonClick65(View v) {
        if (v.getId() == R.id.button65) {
            Intent i = new Intent(Products.this, homeloan.class);
            startActivity(i);
        }
    }
    public void onButtonClick66(View v) {
        if (v.getId() == R.id.button66) {
            Intent i = new Intent(Products.this, education.class);
            startActivity(i);
        }
    }
    public void onButtonClick67(View v) {
        if (v.getId() == R.id.button67) {
            Intent i = new Intent(Products.this, demand.class);
            startActivity(i);
        }
    }
    public void onButtonClick68(View v) {
        if (v.getId() == R.id.button68) {
            Intent i = new Intent(Products.this, twowheeler.class);
            startActivity(i);
        }
    }
}

