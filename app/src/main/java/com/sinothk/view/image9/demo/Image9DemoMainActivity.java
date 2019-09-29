package com.sinothk.view.image9.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.support.v7.app.AppCompatActivity;;

public class Image9DemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_image_9_demo);
    }

    public void onList(View v){
        startActivity(DemoListActivity.class);
    }

    public void onDrag(View v){
        startActivity(DemoDragActivity.class);
    }

    private void startActivity(Class<?> cls) {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        startActivity(intent);
    }
}
