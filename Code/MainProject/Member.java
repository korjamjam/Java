package com.kh.vo;

import java.util.ArrayList;

public class Member {
	private String id;
	private String pwd;
    private String membername;
    private String email;
    private int age;
    private ArrayList<Video> playlist;

    public Member() {
        super();
        this.playlist = new ArrayList<>();
    }
    
    public Member(String id, String pwd, String membername, String email, int age) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.membername = membername;
		this.email = email;
		this.age = age;
		this.playlist = new ArrayList<>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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
		return "아이디 :" + id + ", 비밀번호 :" + pwd + ", 회원 이름 :" + membername + ", 이메일 :" + email + ", 나이 :" + age;
	}


}
