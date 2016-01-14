package com.bosong.ball_light.presenter.fragment;

/**
 * Created by mike on 1/11/16.
 */
import com.bosong.ball_light.model.adapter.ContextMemberAdapter;
import com.bosong.ball_light.view.ContextDelegate;
import com.bosong.ball_light.R;
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
        viewDelegate.setOnClickListener(this, R.id.title_left);
        viewDelegate.setOnClickListener(this, R.id.title_right);
        viewDelegate.setTitleLeft("删除");
        viewDelegate.setTitleRight("新建");
        memberListGV = viewDelegate.getGridView();
        contextMemberAdapter = new ContextMemberAdapter(viewDelegate.getRootView().getContext());
        memberListGV.setAdapter(contextMemberAdapter);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.title_left:
                Toast.makeText(viewDelegate.getRootView().getContext(), "点了删除", Toast.LENGTH_SHORT).show();
                break;
            case R.id.title_right:
                Toast.makeText(viewDelegate.getRootView().getContext(), "点了新建", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
