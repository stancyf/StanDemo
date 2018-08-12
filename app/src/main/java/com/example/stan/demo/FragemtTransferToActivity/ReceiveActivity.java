package com.example.stan.demo.FragemtTransferToActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.stan.demo.R;

/**
 * 基于回调机制，从fragment将数据传送至activity
 * 接收活动
 * Created by Stan on 2018/8/12.
 */

public class ReceiveActivity extends AppCompatActivity implements CallBack{

    private static final String TAG = "ReceiveActivity";

    private Button mButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //此处的fragment要引入v4包下面的fragmemt
        mButton = (Button) findViewById(R.id.activity);
        final TransmitFragment transmitFragment = new TransmitFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment, transmitFragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void getdate(String str) {
        Toast.makeText(this, str,Toast.LENGTH_LONG).show();
    }
}
