package com.example.stan.demo.FragemtTransferToActivity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stan.demo.R;

/**
 * 发送碎片
 * Created by Stan on 2018/8/12.
 */

public class TransmitFragment extends Fragment {

    private static final String TAG = "TransmitFragment";

    private CallBack mCallBack;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context != null){
            mCallBack = (CallBack) getActivity();
            Log.i(TAG, "onAttach: attach success");
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transmit, container, false);
        mCallBack.getdate("这是从fragment中传过来的~");
        return view;
    }
}
