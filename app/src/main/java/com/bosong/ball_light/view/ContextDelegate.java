package com.bosong.ball_light.view;

import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bosong.ball_light.R;
import com.bosong.framework.view.AppDelegate;

/**
 * Created by mike on 1/13/16.
 */
public class ContextDelegate extends AppDelegate {

    private GridView memberListGV;
    private TextView title_left;
    private TextView title_right;

    @Override
    public int getRootLayoutId(){
        return R.layout.delegate_context;
    }

    @Override
    public void initWidget(){
        super.initWidget();

        title_left = get(R.id.title_left);
        title_right = get(R.id.title_right);

        memberListGV = (GridView) get(R.id.gridview_context);
    }

    public GridView getGridView(){;
        return memberListGV;
    }

    public void setTitleLeft(String title_left) {
        this.title_left.setText(title_left);
    }

    public void setTitleRight(String title_right) {
        this.title_right.setText(title_right);
    }
}