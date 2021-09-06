package com.lingzx.mode.adapterpattern.media;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("VLC video");
    }

    @Override
    public void playMp4(String filename) {

    }
}
