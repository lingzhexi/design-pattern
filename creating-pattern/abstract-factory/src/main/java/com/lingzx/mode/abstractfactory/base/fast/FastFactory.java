package com.lingzx.mode.abstractfactory.base.fast;

import com.lingzx.mode.abstractfactory.base.AbstractFactory;
import com.lingzx.mode.abstractfactory.base.HtmlDocument;
import com.lingzx.mode.abstractfactory.base.WordDocument;

/**
 *  FastDoc Soft必须提供一个实际的工厂来生产这两种产品，
 */
public class FastFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return new FastHtmlDocument();
    }

    @Override
    public WordDocument createWord(String md) {
        return new FastWordDocument();
    }
}
