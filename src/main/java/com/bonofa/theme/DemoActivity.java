package com.bonofa.theme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import angel.zhuoxiu.theme.ThemeActivity;
import angel.zhuoxiu.theme.ThemeInterface;
import angel.zhuoxiu.theme.ThemeManager;
import angel.zhuoxiu.theme.ThemeWrapper;


public class DemoActivity extends ThemeActivity implements ThemeInterface {
    String tag = this.getClass().getSimpleName();
    ThemeManager themeManager;
    ThemeWrapper[] themes = new ThemeWrapper[0];
    static int themeResId;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_demo);
    }

    @Override
    public void restartForThemeChange() {
        finish();
        startActivity(getIntent());
    }

    @Override
    public String getPrefix() {
        return "Theme_Bonofa";
    }
}
