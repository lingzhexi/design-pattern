package com.lingzx.single.singlemode.enums;

/**
 * Java 保证每个枚举类都是单例
 */
public enum EnumSingleton {

    INSTANCE;

    private String name = "EnumSingleton";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.getName();
    }
}
