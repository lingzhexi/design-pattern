package com.lingzx.mode.abstractfactory.base;

import java.io.IOException;
import java.nio.file.Path;

// 抽象产品：Word文档接口:
public interface WordDocument {
    void save(Path path) throws IOException;
}