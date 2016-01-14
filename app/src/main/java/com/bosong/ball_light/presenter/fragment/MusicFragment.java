package com.bosong.ball_light.presenter.fragment;

import com.bosong.ball_light.R;
import com.bosong.ball_light.view.MusicDelegate;
import com.bosong.framework.presenter.FragmentPresenter;

import android.view.View;
import android.widget.Toast;

public class MusicFragment extends FragmentPresenter<MusicDelegate> implements View.OnClickListener {

    public static MusicFragment newInstance() {
        MusicFragment musicFragment = new MusicFragment();
        return musicFragment;
    }


    @Override
    protected Class<MusicDelegate> getDelegateClass(){
        return MusicDelegate.class;
    }

    @Override
    protected void bindEventListener(){
        super.bindEventListener();
        //viewDelegate.setOnClickListener(this, R.id.title_left);
        //viewDelegate.setOnClickListener(this, R.id.title_right);
        //viewDelegate.setTitleLeft("删除");
        //viewDelegate.setTitleRight("新建");
    }

    @Override
    public void onClick(View v){
        Toast.makeText(getActivity(), "点了TextView", Toast.LENGTH_SHORT).show();
    }
}