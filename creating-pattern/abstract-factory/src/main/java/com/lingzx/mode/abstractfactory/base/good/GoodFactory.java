package com.lingzx.mode.abstractfactory.base.good;

import com.lingzx.mode.abstractfactory.base.AbstractFactory;
import com.lingzx.mode.abstractfactory.base.HtmlDocument;
import com.lingzx.mode.abstractfactory.base.WordDocument;

public class GoodFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return new GoodHtmlDocument(md);
    }

    @Override
    public WordDocument createWord(String md) {
        return new GoodWordDocument(md);
    }
}
