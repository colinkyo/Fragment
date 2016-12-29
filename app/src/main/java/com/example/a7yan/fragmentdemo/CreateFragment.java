package com.example.a7yan.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class CreateFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("7Yan","----Activity----------------------onCreate----------------------");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_fragment);

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        LeftFragment leftFragment = new LeftFragment();
        RightFragment rightFragment= new RightFragment();

        transaction.add(R.id.fl_left,leftFragment);
        transaction.add(R.id.fl_right,rightFragment);

        transaction.commit();
    }
    @Override
    protected void onStart() {
        Log.e("7Yan","----Activity----------------------onStart----------------------");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.e("7Yan","----Activity----------------------onStop----------------------");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("7Yan","----Activity----------------------onDestroy----------------------");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.e("7Yan","----Activity----------------------onPause----------------------");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.e("7Yan","----Activity----------------------onResume----------------------");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.e("7Yan","----Activity----------------------onRestart----------------------");
        super.onRestart();
    }

    public void click(View view)
    {
        Toast.makeText(this, "我在第二个Activity里面", Toast.LENGTH_SHORT).show();
    }
}
