package com.wangjt.spitest;

import com.wangjt.aninterface.Display;

/**
 * Created by wangjt on 2017/8/15.
 */

public class DispalyImp implements Display {
    @Override
    public String display() {
        return "this is app moudle show";
    }
}
