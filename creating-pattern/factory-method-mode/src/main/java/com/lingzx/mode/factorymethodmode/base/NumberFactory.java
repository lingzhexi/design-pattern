package com.lingzx.mode.factorymethodmode.base;

import com.lingzx.mode.factorymethodmode.base.impl.NumberFactoryImpl;

public interface NumberFactory {
    Number parse(String s);

    static NumberFactory getFactory() {
        return impl;
    }

    static NumberFactory impl = new NumberFactoryImpl();

    public static void main(String[] args) {
        NumberFactory factory = NumberFactory.getFactory();
        System.out.println(factory.parse("1234.56"));
    }
}
