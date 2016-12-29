package com.example.a7yan.fragmentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
    }
    public void click(View view){
        Intent intent=new Intent(this,CreateFragment.class);
        startActivity(intent);
        //Toast.makeText(this, "找得到我啊!", Toast.LENGTH_SHORT).show();
    }
}
