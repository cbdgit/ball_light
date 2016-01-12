package com.bosong.ball_light.view;

import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bosong.ball_light.R;
import com.bosong.framework.view.AppDelegate;

/**
 * Created by mike on 1/12/16.
 */

public class MusicDelegate extends AppDelegate {
    @Override
    public int getRootLayoutId(){
        return R.layout.delegate_music;
    }

    @Override
    public Toolbar getToolbar(){
        //Toolbar toolbar = (Toolbar) get(R.id.toolbar);
        //return toolbar;
        return null;
    }

    @Override
    public void initWidget(){
        super.initWidget();
    }
}
