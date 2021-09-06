package com.lingzx.mode.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    /**
     * 绑定观察者
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知客户
     */
    private void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
