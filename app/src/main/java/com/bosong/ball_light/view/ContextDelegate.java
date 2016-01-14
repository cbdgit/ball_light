package com.bosong.ball_light.view;

import android.widget.GridView;
import android.widget.ImageView;

import com.bosong.ball_light.R;
import com.bosong.framework.view.AppDelegate;

/**
 * Created by mike on 1/13/16.
 */
public class ContextDelegate extends AppDelegate {

    private GridView memberListGV;
    private ImageView delItem;

    @Override
    public int getRootLayoutId(){
        return R.layout.delegate_context;
    }

    @Override
    public void initWidget(){
        super.initWidget();
        //TextView textView = get(R.id.text_view);
        //textView.setText("只是测试");
        memberListGV = (GridView) get(R.id.gridview_context);
        delItem = (ImageView) get(R.id.item_del);
    }

    public GridView getGridView(){;
        return memberListGV;
    }

    public ImageView getDelItemView(){
        return delItem;
    }
}