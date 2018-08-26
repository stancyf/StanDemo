package com.example.stan.demo.Mvp.Presenter;

import com.example.stan.demo.Mvp.View.BaseView;

/**
 * Created by Stan on 2018/8/26.
 */

/**
 * Presenter的基类
 * 主要功能：
 * 1.绑定View
 * 2.解绑View
 * 3.判断View是否绑定
 * 4.返回View
 */
public abstract class BasePresenter {
    private BaseView mBaseView;

    public void onAttach(BaseView baseView) {
        this.mBaseView = baseView;
    }

    public void onDetach() {
        this.mBaseView = null;
    }

    public BaseView getBaseView() {
        return mBaseView;
    }

    public boolean isAlive() {
        return mBaseView != null;
    }

    public abstract void getData(String str);
}
