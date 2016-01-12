package com.bosong.ball_light.view;

import com.bosong.framework.view.AppDelegate;
import com.bosong.ball_light.R;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by mike on 1/11/16.
 */
public class AllDevidesDelegate extends AppDelegate {

    private static final String[] m={"A型","B型","O型","AB型","其他"};
    private TextView view ;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;

    @Override
    public int getRootLayoutId(){
        //return R.layout.delegate_alldevides;
        return 0;
    }

    @Override
    public void initWidget(){
        super.initWidget();
        //TextView textView = get(R.id.text_view);
        //textView.setText("只是测试");

        //spinner = get(R.id.light_group);
        //将可选内容与ArrayAdapter连接起来
        //adapter = new ArrayAdapter<String>(getRootView().getContext(),android.R.layout.simple_spinner_item,m);

        //设置下拉列表的风格
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //将adapter 添加到spinner中
        //spinner.setAdapter(adapter);
    }
}
