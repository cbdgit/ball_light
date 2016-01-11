package com.bosong.ball_light;

import com.bosong.ball_light.presenter.AllDevidesFragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class BaseFragmentPagerAdapter extends FragmentPagerAdapter {
    
    private Context mContext;
    public BaseFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //return SampleFragment.newInstance(CONTENT[position % CONTENT.length]);
        switch(position % 4){
            case 0:
                return AllDevidesFragment.newInstance();
            case 1:
                return AllDevidesFragment.newInstance();
            case 2:
                return AllDevidesFragment.newInstance();
            case 3:
                return AllDevidesFragment.newInstance();
            default:
                return AllDevidesFragment.newInstance();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return new String[]{mContext.getString(R.string.tab1_text), mContext.getString(R.string.tab2_text),
                mContext.getString(R.string.tab3_text), mContext.getString(R.string.tab4_text)}[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}