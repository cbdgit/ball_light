package com.bosong.ball_light.presenter.fragment;

import com.bosong.framework.presenter.FragmentPresenter;
import com.bosong.ball_light.view.AllDevidesDelegate;

import android.view.View;
import android.widget.Toast;

/**
 * Created by mike on 1/11/16.
 */
public class AllDevidesFragment extends FragmentPresenter<AllDevidesDelegate> implements View.OnClickListener {

    public static AllDevidesFragment newInstance() {
        AllDevidesFragment allDevidesFragment = new AllDevidesFragment();
        return allDevidesFragment;
    }

    @Override
    protected Class<AllDevidesDelegate> getDelegateClass(){
        return AllDevidesDelegate.class;
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
