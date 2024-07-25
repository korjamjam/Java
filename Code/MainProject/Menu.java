package com.kh.menu;

import java.util.Scanner;

import com.kh.control.NetflixController;

public class Menu {
	Scanner sc = new Scanner(System.in);
	NetflixController nc = new NetflixController();
	
	public void mainMenu() {
		System.out.println("=====넷플릭스 메뉴=====");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 삭제");
		System.out.println("3. 회원 검색");
		System.out.println("3. 플레이리스트 동영상 추가");
		System.out.println("4. 플레이리스트 동영상 삭제");
		System.out.println("9. 모든 플레이리스트 보기");
		
	}
	
	public void addMember() {	
		
	}
	
	public void deleteMember() {
		
	}
	
	//회원 검색을 하면 회원 정보와 그 회원의 플레이리스트 공개
	public void searchMember() {
		
		
	}
	
	public void saveVideo() {
		
	}
	
	public void deleteVideo() {
		
	}
	
	public void viewMemberPlaylist() {
		
	}
	
	

}
