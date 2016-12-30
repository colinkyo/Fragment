package com.example.a7yan.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 7Yan on 2016/12/30.
 */

public class ContentFragment extends Fragment
{
    private String msg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.content_fragment,null);
        Button btn_getValue = (Button) view.findViewById(R.id.btn_getValue);
        final TextView tv_show = (TextView) view.findViewById(R.id.tv_show);
        btn_getValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("7Yan","good");
                if(msg!=null){
                    tv_show.setText(msg);
                }else{
                    tv_show.setText("没有数据传递");
                }

            }
        });

        return view;
    }
    public void  setMsg(String txt){
        this.msg=txt;
    }
}
