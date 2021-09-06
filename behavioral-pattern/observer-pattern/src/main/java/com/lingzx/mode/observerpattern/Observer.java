package com.lingzx.mode.observerpattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
