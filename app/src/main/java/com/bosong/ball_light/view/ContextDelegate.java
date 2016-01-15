package com.bosong.ball_light.view;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
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
    private PopupWindow mPopupWindow;
    private LayoutInflater inflater;

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

        inflater = LayoutInflater.from(getRootView().getContext());
        View popupView = inflater.inflate(R.layout.delegate_context_popupwindow, null);

        mPopupWindow = new PopupWindow(popupView, 600, WindowManager.LayoutParams.WRAP_CONTENT, true);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.setBackgroundDrawable(new BitmapDrawable(getRootView().getContext().getResources(), (Bitmap) null));
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

    public void showPopupWindowAsDropDown() {
        mPopupWindow.showAsDropDown(getRootView(), -200, -400);
    }

    public void showPopupWindowAtLocation() {
        mPopupWindow.showAtLocation(getRootView(), Gravity.CENTER, 0, 0);
    }
}