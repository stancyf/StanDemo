package com.example.stan.demo.Mvp.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.stan.demo.Mvp.Presenter.BasePresenter;
import com.example.stan.demo.Mvp.Presenter.MvpPresenter;
import com.example.stan.demo.Mvp.View.MvpView;

/**
 * Created by Stan on 2018/8/26.
 */

public class MvpActivity extends BaseActivity implements MvpView {
    private BasePresenter mBasePresenter;
    @Override
    public void showData() {
        mBasePresenter.getData("Success");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBasePresenter.onDetach();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBasePresenter = new MvpPresenter();
        mBasePresenter.onAttach(this);
        showData();
    }

    @Override
    public Context getContext() {
        return super.getContext();
    }
}
