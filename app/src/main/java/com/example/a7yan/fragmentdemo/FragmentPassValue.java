package com.example.a7yan.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentPassValue extends AppCompatActivity {
    private ContentFragment contentFragment;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_pass_value);
        fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        contentFragment=new ContentFragment();
        fragmentTransaction.add(R.id.fl_container,contentFragment,"content");
        fragmentTransaction.commit();
    }
    public void  passValue(View view)
    {
        //以下两种方式都可以传递参数，区别未知
        contentFragment.setMsg("我是在Activity过来的-7Yan");
        //ContentFragment cf= (ContentFragment) fragmentManager.findFragmentByTag("content");
        //cf.setMsg("我是在Activity过来的");
    }
}
