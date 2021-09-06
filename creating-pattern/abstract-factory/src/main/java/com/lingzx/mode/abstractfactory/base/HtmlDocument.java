package com.lingzx.mode.abstractfactory.base;

import java.io.IOException;
import java.nio.file.Path;

// 抽象产品：Html文档接口:
public interface HtmlDocument {
    String toHtml();
    void save(Path path) throws IOException;
}