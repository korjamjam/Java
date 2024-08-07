package com.kh.vo;

public class Video {
    private String videoname;
    private String genre;
    private int limitage;

    public Video() {
        super();
    }

    public Video(String videoname, String genre, int limitage) {
        super();
        this.videoname = videoname;
        this.genre = genre;
        this.limitage = limitage;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLimitage() {
        return limitage;
    }

    public void setLimitage(int limitage) {
        this.limitage = limitage;
    }

    @Override
    public String toString() {
        return "동영상 제목 : " + videoname + " / 장르 : " + genre + " / 나이제한 : " + limitage;
    }
}
