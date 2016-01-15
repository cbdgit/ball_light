package com.bosong.ball_light.presenter.fragment;

/**
 * Created by mike on 1/11/16.
 */
import com.bosong.ball_light.model.adapter.ContextMemberAdapter;
import com.bosong.ball_light.model.bean.ContextMemberBean;
import com.bosong.ball_light.presenter.activity.ContextEditActivity;
import com.bosong.ball_light.view.ContextDelegate;
import com.bosong.ball_light.R;
import com.bosong.framework.presenter.FragmentPresenter;


import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;


public class ContextFragment extends FragmentPresenter<ContextDelegate> implements View.OnClickListener  {

    private GridView memberListGV;
    private ContextMemberAdapter contextMemberAdapter;
    private List<ContextMemberBean> mList = new LinkedList<ContextMemberBean>();

    private int single = 1;

    public static ContextFragment newInstance() {
        ContextFragment contextFragment = new ContextFragment();
        return contextFragment;
    }

    @Override
    protected Class<ContextDelegate> getDelegateClass(){
        return ContextDelegate.class;
    }

    private void initList() {
        mList.add(new ContextMemberBean(R.drawable.home, true));
        mList.add(new ContextMemberBean(R.drawable.outside, false));
        mList.add(new ContextMemberBean(R.drawable.dinner, false));
        mList.add(new ContextMemberBean(R.drawable.theatre, false));
        mList.add(new ContextMemberBean(R.drawable.bed, false));
        mList.add(new ContextMemberBean(R.drawable.sleep, false));
        mList.add(new ContextMemberBean(R.drawable.party, false));
        mList.add(new ContextMemberBean(R.drawable.birthday, false));
        mList.add(new ContextMemberBean(R.drawable.celebrate, false));
    }

    @Override
    protected void bindEventListener(){
        super.bindEventListener();

        initList();

        viewDelegate.setOnClickListener(this, R.id.title_left);
        viewDelegate.setOnClickListener(this, R.id.title_right);
        viewDelegate.setTitleLeft("删除");
        viewDelegate.setTitleRight("新建");

        contextMemberAdapter = new ContextMemberAdapter(viewDelegate.getActivity(), mList);
        memberListGV = viewDelegate.getGridView();
        memberListGV.setAdapter(contextMemberAdapter);

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.title_left:
                if (single % 2 == 1){
                    contextMemberAdapter.setMode(false);
                    viewDelegate.setTitleLeft("取消");
                } else {
                    contextMemberAdapter.setMode(true);
                    viewDelegate.setTitleLeft("删除");
                }
                single++;
                break;
            case R.id.title_right:
                viewDelegate.showPopupWindowAtLocation();
                break;
        }
    }
}
