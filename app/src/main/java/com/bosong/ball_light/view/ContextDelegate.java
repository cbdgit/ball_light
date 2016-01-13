package com.bosong.ball_light.view;

import com.bosong.ball_light.R;
import com.bosong.framework.view.AppDelegate;

/**
 * Created by mike on 1/13/16.
 */
public class ContextDelegate extends AppDelegate {
    @Override
    public int getRootLayoutId(){
        return R.layout.delegate_context;
    }

    @Override
    public void initWidget(){
        super.initWidget();
        //TextView textView = get(R.id.text_view);
        //textView.setText("只是测试");
    }
}