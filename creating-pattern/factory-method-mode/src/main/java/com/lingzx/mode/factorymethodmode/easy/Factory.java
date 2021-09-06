package com.lingzx.mode.factorymethodmode.easy;

import java.math.BigDecimal;

public class Factory {
    private static Number parse(String s) {
        return new BigDecimal(s);
    }

    public static void main(String[] args) {
        Factory.parse("");
    }
}
