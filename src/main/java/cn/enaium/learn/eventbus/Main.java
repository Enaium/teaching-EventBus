package cn.enaium.learn.eventbus;

import cn.enaium.learn.eventbus.events.UpdateEvent;

/**
 * Project: EventBus
 * -----------------------------------------------------------
 * Copyright © 2020-2021 | Enaium | All rights reserved.
 */
public enum Main {

    INSTANCE;

    EventManager eventManager = new EventManager();

    public static void main(String[] args) {
        Main.INSTANCE.eventManager.register(new Test());//register
        new UpdateEvent().call();
    }

    static class Test {
        @Event
        public void on(UpdateEvent e) {
            System.out.println("Event trigger");
        }
    }
}