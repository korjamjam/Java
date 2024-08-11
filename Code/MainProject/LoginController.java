package com.kh.control;

import com.kh.vo.Member;

public class LoginController {
    private Member loggedInMember;
    private boolean isAdmin;

    public boolean login(String username, String email, String password) {
        if (username.equals("admin") && password.equals("admin123")) {
            isAdmin = true;
            loggedInMember = new Member("admin", "admin@admin.com", 30);
            System.out.println("관리자 계정으로 접속하셨습니다.");
            return true;
        } else {
            MemberController mc = new MemberController();
            for (Member member : mc.getMembers()) {
                if (member.getMembername().equals(username) && member.getEmail().equals(email)) {
                    loggedInMember = member;
                    isAdmin = false;
                    System.out.println(member.getMembername() + "님 환영합니다.");
                    return true;
                }
            }
        }
        return false;
    }

    public Member getLoggedInMember() {
        return loggedInMember;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
