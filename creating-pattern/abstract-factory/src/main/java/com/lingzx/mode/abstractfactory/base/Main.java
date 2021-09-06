package com.lingzx.mode.abstractfactory.base;

import lombok.SneakyThrows;

import java.nio.file.Paths;


public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        //使用FASTDOC
        AbstractFactory fastFactory = AbstractFactory.createFactory("fast");
        //生成HTML文档
        HtmlDocument html = fastFactory.createHtml("#Hello\\nHello, world!");
        html.save(Paths.get(".", "fast.html"));
        //生成WORD文档
        WordDocument word = fastFactory.createWord("#Hello\\nHello, world!");
        word.save(Paths.get(".", "fast.doc"));

    }
}
