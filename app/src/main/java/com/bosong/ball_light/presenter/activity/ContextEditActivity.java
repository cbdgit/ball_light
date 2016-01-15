package com.bosong.ball_light.presenter.activity;

import android.os.Bundle;
import com.bosong.ball_light.R;
import com.bosong.ball_light.model.adapter.BaseFragmentPagerAdapter;
import com.bosong.ball_light.view.ContextEditDelegate;
import com.bosong.framework.presenter.ActivityPresenter;

/**
 * Created by mike on 1/15/16.
 */
public class ContextEditActivity extends ActivityPresenter<ContextEditDelegate> {

    @Override
    protected Class<ContextEditDelegate> getDelegateClass(){
        return ContextEditDelegate.class;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

