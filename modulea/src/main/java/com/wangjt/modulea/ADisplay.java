package com.wangjt.modulea;

import com.wangjt.aninterface.Display;

/**
 * Created by wangjt on 2017/8/15.
 *
 */

public class ADisplay implements Display {
    @Override
    public String display() {
        return "this is moduleA  display";
    }
}