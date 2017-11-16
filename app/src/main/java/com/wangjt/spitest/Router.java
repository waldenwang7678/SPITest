package com.wangjt.spitest;


import android.view.Display;

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
        Iterator<Display> iterator = loader.iterator();
        while (iterator.hasNext()){
            Display next = iterator.next();
            map.put(next.getClass().getName(), next);
        }
        for (Display display : loader) {
            map.put(display.getClass().getName(), display);
        }
    }

    public HashMap<String, Display> getMap() {
        return map;
    }

}
