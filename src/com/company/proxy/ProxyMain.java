package com.company.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        LogicManager manager = new LogicManager(new SomeLogicImpl());
        manager.performLogic(10);
        System.out.println();

        LogicManager cachedManager = new LogicManager(new CachedSomeLogicImpl(new SomeLogicImpl()));
        cachedManager.performLogic(10);
        cachedManager.performLogic(10);
        System.out.println();

        LogicManager cachedAndLoggedManager = new LogicManager(new LoggedSomeLogicImpl(new CachedSomeLogicImpl(new SomeLogicImpl())));
        cachedAndLoggedManager.performLogic(10);
        cachedAndLoggedManager.performLogic(10);

    }

}
