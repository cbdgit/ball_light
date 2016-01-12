package com.bosong.ball_light.presenter;

/**
 * Created by mike on 1/11/16.
 */
import com.bosong.ball_light.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ContextFragment extends Fragment {

    private View view;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = LayoutInflater.from(getActivity()).inflate(R.layout.delegate_context, null);
        return view;
    }
}
