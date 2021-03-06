package com.sinothk.view.image9.demo.style1;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sinothk.view.image9.demo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxy on 2017/6/14.
 */

public class DemoListActivity extends AppCompatActivity {
    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    ListAdapter mListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);
        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setNavigationIcon(R.mipmap.icon_back);
        mToolbar.setTitle("列表");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        mRecyclerView = findViewById(R.id.recyclerview);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<DemoEntity> demoEntities = new ArrayList<>();

        String[] pices = getResources().getStringArray(R.array.Pictures);
        for (int i = 5; i >= 0; i--) {
            List<String> picStrings = new ArrayList<>();
            for (int i1 = 0; i1 <= i; i1++) {
                picStrings.add(pices[i1]);
            }
            demoEntities.add(new DemoEntity(picStrings));
        }

//        List<String> picStrings = new ArrayList<>();
//        picStrings.add(pices[0]);
//        picStrings.add(pices[1]);
//        picStrings.add(pices[2]);
//        demoEntities.add(new DemoEntity(picStrings));

        mListAdapter = new ListAdapter(this, demoEntities);
        mRecyclerView.setAdapter(mListAdapter);

    }
}
