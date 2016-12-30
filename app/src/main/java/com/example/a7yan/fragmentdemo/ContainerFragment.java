package com.example.a7yan.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 7Yan on 2016/12/30.
 */

public class ContainerFragment extends Fragment {
    private  TextView tvShow;
    private   Bundle bundle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.container_fragment, null);
        Button btn_getValue = (Button) view.findViewById(R.id.btn_getValue);
        tvShow = (TextView) view.findViewById(R.id.tv_show);

        bundle= getArguments();
        btn_getValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bundle != null) {
                    String values = bundle.getString("key", "");
                    tvShow.setText(values);
                }
            }
        });
        return view;
    }
}
