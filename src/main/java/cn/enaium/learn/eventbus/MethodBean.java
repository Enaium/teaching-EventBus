package cn.enaium.learn.eventbus;

import java.lang.reflect.Method;

/**
 * Project: EventBus
 * -----------------------------------------------------------
 * Copyright © 2020-2021 | Enaium | All rights reserved.
 */
public class MethodBean {
    private final Object object;
    private final Method method;

    public MethodBean(Object object, Method method) {
        this.object = object;
        this.method = method;
    }

    public Object getObject() {
        return object;
    }

    public Method getMethod() {
        return method;
    }
}
