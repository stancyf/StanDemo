package com.example.stan.demo.Mvp.Model;

/**
 * Created by Stan on 2018/8/26.
 */

import android.os.Handler;

import com.example.stan.demo.Mvp.Callback.CallBack;


/**
 * 具体的数据请求逻辑
 */
public class MvpModel {
    public static void getData(final String str, final CallBack callBack) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (str) {
                    case "Success":
                        callBack.onSuccess("Request Success");
                        break;
                    case"Fail":
                        callBack.onFail("Request Fail");
                        break;
                    case"Error":
                        callBack.onError();
                }
                callBack.onComplete();
            }
        }, 1000);
    }
}
