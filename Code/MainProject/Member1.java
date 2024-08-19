package com.kh.vo;

import java.util.ArrayList;

public class Member {
    private String membername;
    private String email;
    private int age;
    private ArrayList<Video> playlist;

    public Member() {
        super();
        this.playlist = new ArrayList<>();
    }

    public Member(String membername, String email, int age) {
        super();
        this.membername = membername;
        this.email = email;
        this.age = age;
        this.playlist = new ArrayList<>();
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Video> getPlaylist() {
        return playlist;
    }

    public void addVideoToPlaylist(Video video) {
        this.playlist.add(video);
    }

    public void removeVideoFromPlaylist(Video video) {
        this.playlist.remove(video);
    }

    @Override
    public String toString() {
        return "회원 이름 : " + membername + " / 이메일 : " + email + " / 나이 : " + age;
    }
}
