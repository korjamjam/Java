package com.kh.control;

import java.util.ArrayList;
import com.kh.vo.Member;
import com.kh.vo.Video;

public class MemberController {
	private ArrayList<Member> members = new ArrayList<>();

	public MemberController() {
		super();
		//미리 등록된 관리자 계정
		members.add(new Member("admin", "ad123", "관리자계정", "admin@kh.com", 99));
		
		//테스트용 일반 회원 계정
		members.add(new Member("1", "11", "하나", "1@.com", 5));
		members.add(new Member("2", "21", "둘", "2@.com", 10));
		members.add(new Member("3", "33", "삼", "3@.com", 15));
		members.add(new Member("4", "44", "넷", "4@.com", 20));
		members.add(new Member("5", "55", "전제민", "5@.com", 25));
	}
	
	/*NeflixMenu에서 입력 받은 값으로 회원 가입 기능 수행*/
	public void addMember(String userId, String userPwd, String name, String email, int age) {
		if (members.size() < 6) {
			members.add(new Member(userId, userPwd, name, email, age));
			System.out.println("회원이 성공적으로 추가되었습니다.");
			return;
		} else {
			System.out.println("회원이 가득 찼습니다.");
			return;
		}
	}
	/*모든 회원 정보 출력*/
	public void AllMembers() {
		for (Member m : members) {
			if (!"admin".equals(m.getId())) {
				System.out.println(m);
			}
		}
	}
	
	/*NeflixMenu에서 입력 받은 이름과 아이디로 회원 검색 기능 수행*/
	public boolean searchMember(String name, String userId) {
		for (Member m : members) {
			if (!"admin".equals(m.getId())) {
				if (m.getMembername().equals(name) && m.getId().equals(userId)) {
					System.out.println(m);
					return true;
				}
			}
		}
		return false;
	}
	
	/*NeflixMenu에서 입력 받은 이름과 아이디로 회원 삭제(탈퇴) 기능 수행*/
	public boolean deleteMember(String name, String userId) {
		for (Member m : members) {
			if (m.getMembername().equals(name) && m.getId().equals(userId)) {
				members.remove(m);
				return true;
			}
		}
		return false;
	}

	/*이름과 아이디가 같을 때의 회원 정보를 return*/
	public Member getMemberByName(String name, String userId) {
		for (Member m : members) {
			if (m.getMembername().equals(name) && m.getId().equals(userId)) {
				return m;
			}
		}
		return null;
	}

	/*로그인에 필요한 아이디와 비밀번호를 입력받고 return */
	public Member getMemberByIdPwd(String userId, String userPwd) {
		for (Member m : members) {
			if (m.getId().equals(userId) && m.getPwd().equals(userPwd)) {
				return m;
			}
		}
		return null;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	/*NeflixMenu에서 입력 받은 이름과 아이디가 같은 회원 플레이리스트 출력*/
	public void viewMemberPlaylist(String name, String userId) {

		for (Member m : members) {
			if (m.getMembername().equals(name) && m.getId().equals(userId)) {
				System.out.println(m);
			}
			if (m.getMembername().equals(name) && m.getId().equals(userId)) {
				System.out.println(m.getMembername() + "님의 동영상 목록");
				for (Video v : m.getPlaylist()) {
					System.out.println(v);
				}
			}
		}
	}

	/*모든 회원의 정보와 플레이리스트 출력*/
	public void viewAllMemberVideo() {
		for (Member m : members) {
			if (!"admin".equals(m.getId())) {
				this.viewMemberPlaylist(m.getMembername(), m.getId());
			}
			System.out.println("---------------------------------------------------------");
		}
	}

}
