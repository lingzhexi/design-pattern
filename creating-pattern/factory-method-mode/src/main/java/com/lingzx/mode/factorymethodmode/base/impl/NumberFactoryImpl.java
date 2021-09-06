package com.lingzx.mode.factorymethodmode.base.impl;

import com.lingzx.mode.factorymethodmode.base.NumberFactory;

import java.math.BigDecimal;

public class NumberFactoryImpl implements NumberFactory {

    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
