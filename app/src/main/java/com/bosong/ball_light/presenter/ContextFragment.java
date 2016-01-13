package com.bosong.ball_light.presenter;

/**
 * Created by mike on 1/11/16.
 */
import com.bosong.ball_light.R;
import com.bosong.ball_light.view.ContextDelegate;
import com.bosong.framework.presenter.FragmentPresenter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class ContextFragment extends FragmentPresenter<ContextDelegate> implements View.OnClickListener  {

    public static ContextFragment newInstance() {
        ContextFragment contextFragment = new ContextFragment();
        return contextFragment;
    }

    @Override
    protected Class<ContextDelegate> getDelegateClass(){
        return ContextDelegate.class;
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
