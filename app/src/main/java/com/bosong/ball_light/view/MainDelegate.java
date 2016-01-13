package com.bosong.ball_light.view;

import com.bosong.ball_light.BaseFragmentPagerAdapter;
import com.bosong.ball_light.FadeTabIndicator;
import com.bosong.ball_light.R;

import com.bosong.framework.view.AppDelegate;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

/**
 * Created by mike on 1/13/16.
 */
public class MainDelegate extends AppDelegate {

    private FadeTabIndicator fadeTabIndicator;
    private ViewPager viewPager;

    @Override
    public int getRootLayoutId(){
        return R.layout.delegate_main;
    }

    @Override
    public Toolbar getToolbar(){
        Toolbar toolbar = get(R.id.toolbar);
        return toolbar;
    }

    @Override
    public void initWidget(){
        fadeTabIndicator = (FadeTabIndicator) get(R.id.fade_tab_indicator);
        viewPager = (ViewPager) get(R.id.view_pager);
    }

    public ViewPager getViewPager(){
        return viewPager;
    }

    public FadeTabIndicator getIndicator(){
        return fadeTabIndicator;
    }
}
