package com.kh.control;

import com.kh.vo.Member;
import com.kh.vo.Video;

public class NetflixController {
	private Video[] vid = new Video[6]; // 등록된 동영상
	private Member[] mem = new Member[5]; // 아직 등록 되지는 않았지만 최대로 등록할 수 있는 멤버 수
	
	
	public NetflixController() {
		super();
		vid[0] = new Video("스위트홈" , "공포" , 18);
		vid[1] = new Video("최애의 아이" , "애니" , 15);
		vid[2] = new Video("타이타닉" , "로맨스" , 15);
		vid[3] = new Video("인사이드 아웃" , "애니" , 0);
		vid[4] = new Video("나는 솔로" , "예능" , 15);
		vid[5] = new Video("서울의 봄" , "드라마" , 12);
	}

	//Member배열에 이름과 이메일, 나이 할당
	public void addMember(String name, String email, int age) {
		for(int i=0; i<mem.length; i++) {
			if(mem[i] != null) {
				mem[i] = new Member(name, email, age);
				System.out.println(mem.toString());
			}
			
		}
		
	}
	
	//등록된회원들을 보여준다.
	public void printMember() {
		for(int i=0; i<mem.length; i++) {
			mem[i].toString();
		}
	}
	
//	public void deleteMember(String name) {
//		
//	}
//	
//	//회원 검색을 하면 회원 정보와 그 회원의 플레이리스트 공개
//	public void searchMember() {
//		
//		
//	}
//	//Video배열에 있는 동영상 목록을 보여준뒤 회원 이름을 입력 후 원하는 동영상 플레이리스트에 추가
//	//각 회원마다 개인의 플레이리스트를 가짐.
//	public void saveVideo() {
//		
//	}
//	//회원의 이름 검색한 뒤 그 회원의 플레이리스트 목록을 보여주고 동영상 이름을 입력해 플레이리스트에서 제거
//	//플레이리스트에 동영상이 여러개일 경우 삭제한 동영상의 뒤 동영상을 앞으로 당김.
//	public void deleteVideo() {
//		
//	}
//	
//	//회원의 이름과 이메일을 입력하면 
//	public void viewMemberPlaylist() {
//		
//	}
	

}


