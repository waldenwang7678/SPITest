package com.wangjt.spitest;

import android.app.Application;

import com.walden.common.Router;

/**
 * @author wangjt
 * @date 2017/11/16
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        Router.getInstance().init();
    }
}
