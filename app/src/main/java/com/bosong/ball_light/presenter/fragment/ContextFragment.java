package com.bosong.ball_light.presenter.fragment;

/**
 * Created by mike on 1/11/16.
 */
import com.bosong.ball_light.model.adapter.ContextMemberAdapter;
import com.bosong.ball_light.view.ContextDelegate;
import com.bosong.framework.presenter.FragmentPresenter;

import android.view.View;
import android.widget.GridView;
import android.widget.Toast;


public class ContextFragment extends FragmentPresenter<ContextDelegate> implements View.OnClickListener  {

    private GridView memberListGV;
    private ContextMemberAdapter contextMemberAdapter;

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
        memberListGV = viewDelegate.getGridView();
        contextMemberAdapter = new ContextMemberAdapter(viewDelegate.getRootView().getContext());
        memberListGV.setAdapter(contextMemberAdapter);
    }

    @Override
    public void onClick(View v){
    }
}
