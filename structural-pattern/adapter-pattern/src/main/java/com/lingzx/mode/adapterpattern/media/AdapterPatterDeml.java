package com.lingzx.mode.adapterpattern.media;

public class AdapterPatterDeml {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "xx.mp3");
        audioPlayer.play("vlc", "xx.vlc");
        audioPlayer.play("mp4","xxx.mp4");
    }
}
