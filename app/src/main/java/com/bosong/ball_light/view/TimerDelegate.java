package com.bosong.ball_light.view;

import android.support.v7.widget.Toolbar;

import com.bosong.ball_light.R;
import com.bosong.framework.view.AppDelegate;

/**
 * Created by mike on 1/13/16.
 */
public class TimerDelegate extends AppDelegate {
    @Override
    public int getRootLayoutId(){
        return R.layout.delegate_timer;
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
