package com.lingzx.mode.adapterpattern.media;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("MP4 video");
    }
}
