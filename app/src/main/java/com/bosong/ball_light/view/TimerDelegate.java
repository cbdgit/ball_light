package com.bosong.ball_light.view;

import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.bosong.ball_light.R;
import com.bosong.framework.view.AppDelegate;

/**
 * Created by mike on 1/13/16.
 */
public class TimerDelegate extends AppDelegate {

    private TextView title_left;
    private TextView title_right;

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

        title_left = get(R.id.title_left);
        title_right = get(R.id.title_right);
    }

    public void setTitleLeft(String title_left) {
        this.title_left.setText(title_left);
    }

    public void setTitleRight(String title_right) {
        this.title_right.setText(title_right);
    }
}
