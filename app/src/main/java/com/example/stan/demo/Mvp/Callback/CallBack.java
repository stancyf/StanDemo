package com.example.stan.demo.Mvp.Callback;

/**
 * Created by Stan on 2018/8/26.
 */

/**
 * 数据请求的结果
 */
public interface CallBack {
    /**
     * 请求成功
     * @param str
     */
    void onSuccess(String str);

    /**
     * 请求失败
     * @param str
     */
    void onFail(String str);

    /**
     * 请求结束
     */
    void onComplete();

    /**
     * 请求出错
     */
    void onError();
}
