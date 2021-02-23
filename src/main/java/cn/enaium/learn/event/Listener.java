package cn.enaium.learn.event;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Project: EventBus
 * -----------------------------------------------------------
 * Copyright © 2020-2021 | Enaium | All rights reserved.
 */
public class Listener {
    public void call() {
        CopyOnWriteArrayList<MethodBean> methodBeans = Main.INSTANCE.eventManager.getEvent(this.getClass());

        if(methodBeans == null) {
            return;
        }

        methodBeans.forEach(event -> {
            try {
                event.getMethod().invoke(event.getObject(), this);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }
}
