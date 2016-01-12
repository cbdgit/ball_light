package com.bosong.ball_light.view;

import com.bosong.framework.view.AppDelegate;
import com.bosong.ball_light.R;

import android.widget.TextView;
/**
 * Created by mike on 1/11/16.
 */
public class AllDevidesDelegate extends AppDelegate {
    @Override
    public int getRootLayoutId(){
        return R.layout.delegate_alldevides;
    }

    @Override
    public void initWidget(){
        super.initWidget();
        //TextView textView = get(R.id.text_view);
        //textView.setText("只是测试");
    }
}
