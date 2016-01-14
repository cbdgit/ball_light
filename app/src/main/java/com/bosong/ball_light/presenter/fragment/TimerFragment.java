package com.bosong.ball_light.presenter.fragment;

/**
 * Created by mike on 1/11/16.
 */
import com.bosong.ball_light.R;
import com.bosong.ball_light.view.TimerDelegate;
import com.bosong.framework.presenter.FragmentPresenter;

import android.view.View;
import android.widget.Toast;

public class TimerFragment extends FragmentPresenter<TimerDelegate> implements View.OnClickListener {

    public static TimerFragment newInstance() {
        TimerFragment timerFragment = new TimerFragment();
        return timerFragment;
    }


    @Override
    protected Class<TimerDelegate> getDelegateClass(){
        return TimerDelegate.class;
    }

    @Override
    protected void bindEventListener(){
        super.bindEventListener();
        viewDelegate.setOnClickListener(this, R.id.title_left);
        viewDelegate.setOnClickListener(this, R.id.title_right);
        viewDelegate.setTitleLeft("删除");
        viewDelegate.setTitleRight("添加");
    }

    @Override
    public void onClick(View v){
        Toast.makeText(getActivity(), "点了TextView", Toast.LENGTH_SHORT).show();
    }
}
