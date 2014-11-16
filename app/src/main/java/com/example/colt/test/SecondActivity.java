package com.example.colt.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        int clickTime = bundle.getInt("clickTime");

        TextView view = (TextView) findViewById(R.id.main_msg);
        view.setText(String.format("上一页面点击次数为%d",clickTime));
    }

}
