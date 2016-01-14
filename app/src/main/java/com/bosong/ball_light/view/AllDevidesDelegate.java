package com.bosong.ball_light.view;

import com.bosong.framework.view.AppDelegate;
import com.bosong.ball_light.R;

import android.widget.TextView;
/**
 * Created by mike on 1/11/16.
 */
public class AllDevidesDelegate extends AppDelegate {

    private TextView title_left;
    private TextView title_right;

    @Override
    public int getRootLayoutId(){
        return R.layout.delegate_alldevides;
    }

    @Override
    public void initWidget(){
        super.initWidget();

        title_left = get(R.id.title_left);
        title_right = get(R.id.title_right);
    }

    public void setTitleLeft(String title_left) {
        this.title_left.setText(title_left);
    }

    public void setTitleRight(String title_right) {
        this.title_right.setText(title_right);
    }
}
