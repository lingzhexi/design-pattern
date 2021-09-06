package com.lingzx.single.singlemode.base;

/**
 * 单例模式
 */
public class Singleton {

    //静态变量创建唯一实例
    private static final Singleton INSTANCE = new Singleton();
    //私有构造器，确保外部无法实例化
    private Singleton() { }
    //全局访问点
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
