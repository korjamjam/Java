package com.kh.control;

import com.kh.vo.Member;

public class LoginController {
	
	private Member LoginMember;
	private boolean isAdmin;
	
	public boolean login(String name, String email, String password) {
		if(name.equals("admin") && password.equals("admin123")) {
			isAdmin = true;
			LoginMember = new Member("admin", "admin@admin.com", 123);
			System.out.println("관리자 계정으로 접속했습니다.");
			return true;
		}else {
			MemberController mc = new MemberController();
			for(Member m : mc.getMembers()) {
				if(m.getMembername().equals(name) && m.getEmail().equals(email)) {
					LoginMember = m;
					isAdmin = false;
					System.out.println(m.getMembername() + "님 환영합니다.");
					return true;
				}
			}
		}
		return false;
	}
	public Member getLoginMember() {
		return LoginMember;
	}
	public boolean isAdmin() {
		return isAdmin;
	}

}
