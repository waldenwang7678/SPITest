package com.wangjt.aninterface;


/**
 * @author wangjt
 */
public abstract class Display {
    /**
     * doSomething
     *
     * @return string
     */
    public abstract String display();

    /**
     * 返回类名
     *
     * @return str
     */
    String getClassName() {
        return this.getClass().getName();
    }
}
