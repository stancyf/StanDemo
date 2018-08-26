package com.example.stan.demo.Mvp.View;

/**
 * Created by Stan on 2018/8/26.
 */

import android.content.Context;

/**
 * View层基类
 * 主要功能：
 * 1.显示ProgressBar
 * 2.隐藏ProgressBar
 * 3.显示Toast
 * 4.显示错误提示
 * 5.获取Context
 */
public interface BaseView {

    void showLoading();

    void hideLoading();

    void showError();

    void showToast(String msg);

    Context getContext();
}
