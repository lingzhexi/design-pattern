package com.lingzx.single.singlemode.base;

public class SingletonTest {

    static {
        System.out.println("init Singleton class...");
    }

    private static SingletonTest instance = createInstance();

    private static SingletonTest createInstance() {
        System.out.println("create singleton instance...");
        return new SingletonTest();
    }

    private SingletonTest() {
    }

    public static SingletonTest getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonTest s = null;
        System.out.println(SingletonTest.class);
        s = SingletonTest.getInstance(); // create singleton instance...
        System.out.println(s);
    }
}
