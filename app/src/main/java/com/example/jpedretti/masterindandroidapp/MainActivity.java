package com.example.jpedretti.masterindandroidapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.jpedretti.masterindandroidapp.adapter.MyPageAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager mPager;

    @Override
    protected void onStart() {
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyPageAdapter adapter = new MyPageAdapter(getSupportFragmentManager());
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(adapter);
    }

    /*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
                //getSupportFragmentManager().popBackStack();
                //return true;
            } else if (mPager.getCurrentItem() > 0) {
                mPager.setCurrentItem(mPager.getCurrentItem() - 1);
                return true;
            }
        }

        return super.onKeyDown(keyCode, event);
    }*/

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() > 0) {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        } else {
            super.onBackPressed();
        }
    }
}
