package com.example.a7yan.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentPassVuale extends AppCompatActivity {
    private FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_pass_vuale);
        manager=getFragmentManager();
    }
    public void passValue(View view){
        FragmentTransaction fragmentTransaction=manager.beginTransaction();
        ContainerFragment containerFragment=new ContainerFragment();
        Bundle bundle=new Bundle();
        bundle.putString("key","我在Activity中传递的值");
        containerFragment.setArguments(bundle);
        fragmentTransaction.add(R.id.fl_container,containerFragment);
        fragmentTransaction.commit();
    }
}
