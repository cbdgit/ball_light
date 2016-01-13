
package com.bosong.ball_light;

import com.bosong.ball_light.FadeTabIndicator.FadingTab;
import com.bosong.ball_light.view.AllDevidesDelegate;
import com.bosong.ball_light.view.MainDelegate;

import com.bosong.framework.presenter.ActivityPresenter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends ActivityPresenter<MainDelegate> {

    private FadeTabIndicator fadeTabIndicator;
    private ViewPager viewPager;

    @Override
    protected Class<MainDelegate> getDelegateClass(){
        return MainDelegate.class;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewPager = viewDelegate.getViewPager();
        fadeTabIndicator = viewDelegate.getIndicator();

        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(new FadeTabFragmentPagerAdapter(this, getSupportFragmentManager()));
        fadeTabIndicator.setViewPager(viewPager);
        fadeTabIndicator.setCurrentItem(0);
    }

    private class FadeTabFragmentPagerAdapter extends BaseFragmentPagerAdapter implements FadeTabIndicator.FadingTab {

        public FadeTabFragmentPagerAdapter(Context context, FragmentManager fm) {
            super(context, fm);
        }

        @Override
        public int getTabNormalIconResId(int position) {
            return new int[]{
                    R.drawable.ic_1_1,
                    R.drawable.ic_2_1,
                    R.drawable.ic_3_1,
                    R.drawable.ic_4_1}[position];
        }

        @Override
        public int getTabSelectIconResId(int position) {
            return new int[]{
                    R.drawable.ic_1_0,
                    R.drawable.ic_2_0,
                    R.drawable.ic_3_0,
                    R.drawable.ic_4_0}[position];
        }

        @Override
        public int getTabNormalTextColorResId(int position) {
            return R.color.text_normal;
        }

        @Override
        public int getTabSelectTextColorResId(int position) {
            return R.color.text_select;
        }
    }
}
