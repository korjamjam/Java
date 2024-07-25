package com.kh.vo;

public class Video {
	private String videoname;
	private String type;
	private int limitage;
	
	public Video() {
		super();
	}
	
	public Video(String videoname, String type, int limitage) {
		super();
		this.videoname = videoname;
		this.type = type;
		this.limitage = limitage;
	}

	public String getVideoname() {
		return videoname;
	}

	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLimitage() {
		return limitage;
	}

	public void setLimitage(int limitage) {
		this.limitage = limitage;
	}

	@Override
	public String toString() {
		return "Video [videoname=" + videoname + ", type=" + type + ", limitage=" + limitage + "]";
	}
	
	
	

}
