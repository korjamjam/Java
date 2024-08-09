package com.kh.control;

import java.util.ArrayList;
import com.kh.vo.Member;
import com.kh.vo.Video;

public class MemberController {
	private ArrayList<Member> members = new ArrayList<>();

	public MemberController() {
		super();
		//임의의 멤버
		members.add(new Member("전제민","1@.com",10));
		members.add(new Member("제민","2@.com",15));
		members.add(new Member("민","3@.com",20));
	}

	/*
	<회원 저장>
	- 최대인원수 5명으로 지정
	- 최대인원수를 넘으면 저장 불가
	*/
	public void addMember(String name, String email, int age) {
		if (members.size() < 5) {
			members.add(new Member(name, email, age));
			System.out.println("회원이 성공적으로 추가되었습니다.");
		} else {
			System.out.println("회원이 가득 찼습니다.");
			return;

		}
	}

	/*
	<모든 회원 출력>
	- Member클래스의 toString을 오버라이딩해 출력함.(모든 회원을 보여줌)
	*/
	public void printMembers() {
		for (Member m : members) {
			System.out.println(m);
		}
	}

	/*
	<회원 삭제>
	- members 컬렉션을 순회하여 주어진 name과 일치하는 멤버 객체를 찾음
	- 일치하면 remove로 회원삭제후 true 반환, 없으면 false 반환
	*/
	public boolean deleteMember(String name) {
		for (Member m : members) {
			if (m.getMembername().equals(name)) {
				members.remove(m);
				return true;
			}
		}
		return false;
	}

	/*
	<특정 회원 검색>
	- members 컬렉션을 순회하여 주어진 name과 일치하는 멤버 객체를 찾음
	- 찾으면 그 객체와 동영상목록을 출력하고 true 반환, 일치하는 멤버가 없으면 false 반환
	*/
	public boolean searchMember(String name) {
		for (Member m : members) {
			if (m.getMembername().equals(name)) {
				System.out.println(m);
				System.out.println(m.getMembername() + "님의 동영상 목록");
				for (Video v : m.getPlaylist()) {
					System.out.println(v);
				}
				return true;
			}
		}
		return false;
	}

	/*
	<NetflixController에서 사용)
	 members 컬렉션을 순회하여 주어진 name과 일치하는 멤버 객체를 찾고, 찾으면 그 객체를 반환
	 일치하는 멤버가 없으면 null을 반환(해당 이름의 멤버가 없다)
	*/
	public Member getMemberByName(String name) {
		for (Member m : members) {
			if (m.getMembername().equals(name)) {
				return m;
			}
		}
		return null;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}
	
	/*
	<모든 회원의 동영상 출력>
	- members 컬렉션을 순회하여 주어진 name과 일치하는 멤버 객체를 찾음
	- 찾으면 그 객체와 동영상목록을 출력
	*/
	public void viewMemberPlaylist() {
		System.out.println();
		for (Member m : members) {
			System.out.println(m);
			System.out.println(m.getMembername() + "님의 동영상 목록");
			for (Video v : m.getPlaylist()) {
				System.out.println(v);
			}
		}
	}
}
