package com.example.javaappversion20.Models;

public class subscriptionRoundModel {

    int channelImage;
    String channelName;

    public subscriptionRoundModel(int channelImage, String channelName) {
        this.channelImage = channelImage;
        this.channelName = channelName;
    }

    public int getChannelImage() {
        return channelImage;
    }

    public void setChannelImage(int channelImage) {
        this.channelImage = channelImage;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
