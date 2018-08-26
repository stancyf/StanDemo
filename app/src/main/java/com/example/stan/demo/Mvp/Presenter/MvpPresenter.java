package com.example.stan.demo.Mvp.Presenter;


import com.example.stan.demo.Mvp.Callback.CallBack;
import com.example.stan.demo.Mvp.Model.MvpModel;

/**
 * Created by Stan on 2018/8/26.
 */

/**
 * Presenter实现类
 * 主要功能：
 * 1.进行数据请求，但具体逻辑在Model层中
 * 2.进行UI层更新，具体更新逻辑在Activity中
 * 3.其为纯Java代码，其中不应该存在Android API
 */
public class MvpPresenter extends BasePresenter {

    @Override
    public void getData(String str) {
        if (!isAlive()) {
            return;
        }
        getBaseView().showLoading();
        MvpModel.getData(str, new CallBack() {

            @Override
            public void onSuccess(String str) {
                if (isAlive()) {
                    getBaseView().showToast(str);
                }
            }

            @Override
            public void onFail(String str) {
                getBaseView().showToast(str);
            }

            @Override
            public void onComplete() {
                getBaseView().hideLoading();
            }

            @Override
            public void onError() {
                getBaseView().showError();
            }
        });
    }
}
