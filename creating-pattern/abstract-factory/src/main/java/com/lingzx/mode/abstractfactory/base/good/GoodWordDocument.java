package com.lingzx.mode.abstractfactory.base.good;

import com.lingzx.mode.abstractfactory.base.WordDocument;

import java.io.IOException;
import java.nio.file.Path;

public class GoodWordDocument implements WordDocument {
    public GoodWordDocument(String md) {
    }

    @Override
    public void save(Path path) throws IOException {

    }
}
