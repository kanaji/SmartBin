package com.best_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button bluetooth;
    ListView devicelist;
    bluetooth = (Button)findViewById(R.id.button);
    devicelist = (ListView)findViewById(R.id.listView);
}
