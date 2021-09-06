package com.lingzx.mode.abstractfactory.base;

import com.lingzx.mode.abstractfactory.base.fast.FastFactory;
import com.lingzx.mode.abstractfactory.base.good.GoodFactory;
import lombok.SneakyThrows;

//抽象工厂

public interface AbstractFactory {
    // 创建Html文档:
    HtmlDocument createHtml(String md);
    // 创建Word文档:
    WordDocument createWord(String md);

    @SneakyThrows
    public static AbstractFactory createFactory(String name) {
        if (name.equalsIgnoreCase("fast")) {
            return new FastFactory();
        } else if (name.equalsIgnoreCase("good")) {
            return new GoodFactory();
        } else {
            throw new IllegalAccessException("Invalid factory name");
        }
    }
}
