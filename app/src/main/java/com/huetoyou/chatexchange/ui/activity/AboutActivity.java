package com.huetoyou.chatexchange.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.huetoyou.chatexchange.R;
import com.huetoyou.chatexchange.ui.misc.hue.ActionBarHue;
import com.huetoyou.chatexchange.ui.misc.hue.ThemeHue;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class AboutActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        ThemeHue.setTheme(AboutActivity.this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBarHue.setActionBarColorToSharedPrefsValue(this);

        //noinspection ConstantConditions
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About");
    }

    @Override
    public boolean onSupportNavigateUp()
    {
        finish();
        return true;
    }
}
