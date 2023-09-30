package com.example.javaappversion20.Models;

public class videoModel {

    int imgVideo;
    String lengthVideo;
    int channelVideo;
    String TitleVideo;
    String NameVideo;
    String ViewsVideo;
    String PeriodVideo;

    public videoModel(int imgVideo, String lengthVideo, int channelVideo, String titleVideo, String nameVideo, String viewsVideo, String periodVideo) {
        this.imgVideo = imgVideo;
        this.lengthVideo = lengthVideo;
        this.channelVideo = channelVideo;
        TitleVideo = titleVideo;
        NameVideo = nameVideo;
        ViewsVideo = viewsVideo;
        PeriodVideo = periodVideo;
    }

    public int getImgVideo() {
        return imgVideo;
    }

    public void setImgVideo(int imgVideo) {
        this.imgVideo = imgVideo;
    }

    public String getLengthVideo() {
        return lengthVideo;
    }

    public void setLengthVideo(String lengthVideo) {
        this.lengthVideo = lengthVideo;
    }

    public int getChannelVideo() {
        return channelVideo;
    }

    public void setChannelVideo(int channelVideo) {
        this.channelVideo = channelVideo;
    }

    public String getTitleVideo() {
        return TitleVideo;
    }

    public void setTitleVideo(String titleVideo) {
        TitleVideo = titleVideo;
    }

    public String getNameVideo() {
        return NameVideo;
    }

    public void setNameVideo(String nameVideo) {
        NameVideo = nameVideo;
    }

    public String getViewsVideo() {
        return ViewsVideo;
    }

    public void setViewsVideo(String viewsVideo) {
        ViewsVideo = viewsVideo;
    }

    public String getPeriodVideo() {
        return PeriodVideo;
    }

    public void setPeriodVideo(String periodVideo) {
        PeriodVideo = periodVideo;
    }
}
