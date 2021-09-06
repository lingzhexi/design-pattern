package com.lingzx.mode.abstractfactory.base.fast;

import com.lingzx.mode.abstractfactory.base.HtmlDocument;

import java.io.IOException;
import java.nio.file.Path;

public class FastHtmlDocument implements HtmlDocument {
    public String toHtml() {
        return "";
    }
    public void save(Path path) throws IOException {

    }
}