package com.kh.control;

import java.util.Scanner;

import com.kh.vo.Member;

public class LoginController {
    private MemberController mc;
    private Member loggedInMember;
    private boolean isAdmin = false;

    public LoginController(MemberController mc) {
        this.mc = mc;
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디: ");
        String userId = sc.nextLine();
        System.out.print("비밀번호: ");
        String userPwd = sc.nextLine();

        loggedInMember = mc.getMemberByIdAndPwd(userId, userPwd);

        if (loggedInMember != null) {
            if ("admin".equals(userId) && "ad123".equals(userPwd)) {
                isAdmin = true;
                System.out.println("관리자로 로그인 되었습니다.");
            } else {
                isAdmin = false;
                System.out.println("회원으로 로그인 되었습니다.");
            }
        } else {
            System.out.println("로그인 정보가 일치하지 않습니다.");
        }
    }

    public boolean isLoggedIn() {
        return loggedInMember != null;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public Member getLoggedInMember() {
        return loggedInMember;
    }

    public void logout() {
        loggedInMember = null;
        isAdmin = false;
        System.out.println("로그아웃 되었습니다.");
    }
}
