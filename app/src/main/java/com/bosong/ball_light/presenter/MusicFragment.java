package com.bosong.ball_light.presenter;

import com.bosong.ball_light.R;
import com.bosong.ball_light.view.MusicDelegate;
import com.bosong.framework.presenter.FragmentPresenter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        //viewDelegate.setOnClickListener(this, R.id.text_view);
    }

    @Override
    public void onClick(View v){
        Toast.makeText(getActivity(), "点了TextView", Toast.LENGTH_SHORT).show();
    }
}