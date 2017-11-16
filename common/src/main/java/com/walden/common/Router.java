package com.walden.common;


import com.wangjt.aninterface.Display;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author wangjt
 * @date 2017/11/16
 */

public class Router {
    private static Router instance;

    private Router() {
    }

    public static Router getInstance() {
        if (instance == null) {
            synchronized (Router.class) {
                if (instance == null) {
                    instance = new Router();
                }
            }

        }
        return instance;
    }


    private HashMap<String, Display> map = new HashMap<>();

    public void init() {
        ServiceLoader<Display> loader = ServiceLoader.load(Display.class);
        for (Display display : loader) {
            map.put(display.getClass().getName(), display);
        }
    }

    public HashMap<String, Display> getMap() {
        return map;
    }

}
