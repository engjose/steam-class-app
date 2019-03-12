package com.steam.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.steam.app.util.Store;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        TextView mToken = findViewById(R.id.tv_token);
        String token = Store.getString(MainActivity.this, Constans.TOKEN);
        mToken.setText("token:" + token);
    }
}
