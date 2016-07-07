package com.antonio.jsonlist_mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.antonio.jsonlist_mvp.R;
import com.antonio.jsonlist_mvp.adapters.GuideAdapter;
import com.antonio.jsonlist_mvp.model.Data;
import com.antonio.jsonlist_mvp.model.Guide;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Guide> guideList = ((Data) getIntent().getSerializableExtra(SplashActivity.DATA_TAG)).getGuideList();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(new GuideAdapter(guideList));
    }
}
