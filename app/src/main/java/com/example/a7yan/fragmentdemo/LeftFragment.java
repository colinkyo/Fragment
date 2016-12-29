package com.example.a7yan.fragmentdemo;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 7yan on 2016/12/29.
 */

public class LeftFragment extends Fragment {
    //挂载fragment到Activity中
    @Override
    public void onAttach(Context context)
    {
        Log.i("7Yan","----Fragment----------------------onAttach----------------------");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("7Yan","----Fragment-------------------onCreate--------------------------");
        super.onCreate(savedInstanceState);
    }
    //创建Fragment视图
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Log.i("7Yan","----Fragment-----------------onCreateView----------------------------");
        return inflater.inflate(R.layout.left_fragment,null);
    }
    //当Activity的onCreate()方法执行完毕时，告诉Fragment自己创建完毕
    //onActivityCreated用了接受Activity传递的信息
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("7Yan","----Fragment-------------------onActivityCreated-------------------------");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("7Yan","----Fragment------------------------onStart---------------------");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("7Yan","----Fragment-----------------------onResume----------------------");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("7Yan","----Fragment------------------------onPause---------------------");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("7Yan","----Fragment------------------------onStop---------------------");
        super.onStop();
    }
    //销毁视图的方法
    @Override
    public void onDestroyView() {
        Log.i("7Yan","----Fragment------------------------onDestroyView---------------------");
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        Log.i("7Yan","----Fragment------------------------onDetach---------------------");
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        Log.i("7Yan","----Fragment------------------------onDestroy---------------------");
        super.onDestroy();
    }
}
