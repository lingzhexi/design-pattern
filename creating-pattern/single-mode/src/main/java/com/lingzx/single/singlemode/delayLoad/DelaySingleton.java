package com.lingzx.single.singlemode.delayLoad;

import java.util.Date;
import java.util.concurrent.DelayQueue;

/**
 * 实际没有多大作用--开发的时候不会使用
 * 延时加载
 * 饿汉  调用即实例
 * 懒汉  调用再实例
 * 单例模式不建议使用延迟加载
 *
 */
public class DelaySingleton {

    private static DelaySingleton INSTANCE = null;
    private DelaySingleton() {    }
    //懒汉模式--(不适用于多线程，由于指令重排列会导致问题）
    public DelaySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DelaySingleton();
        }
        return INSTANCE;
    }
    //优化1：加锁保证多线程不出问题，影响性能
    public synchronized DelaySingleton getInstanceSycn() {
        if(INSTANCE == null){
            INSTANCE = new DelaySingleton();
        }
        return INSTANCE;
    }
    //优化2:双端检锁-- todo JAVA内存模型，双端检锁不成立？？
    //不幸的是，该代码在优化编译器或共享内存多处理器存在的情况下无法工作
    public DelaySingleton getInstanceCheckDouble() {
        if (INSTANCE == null) {
            synchronized (DelaySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DelaySingleton();
                }
            }
        }
        return INSTANCE;
    }


}
