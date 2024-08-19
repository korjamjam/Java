package com.kh.control;

import java.util.ArrayList;
import com.kh.vo.Member;
import com.kh.vo.Video;

public class MemberController {
    private ArrayList<Member> members = new ArrayList<>();

    public MemberController() {
        super();
        members.add(new Member("admin", "ad123", "관리자계정", "admin@kh.com", 99));
    }

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

    public void printMembers() {
        for (Member m : members) {
            if (!"admin".equals(m.getId())) {
                System.out.println(m);
            }
        }
    }

    public boolean deleteMember(String name, String userId) {
        for (Member m : members) {
            if (m.getMembername().equals(name) && m.getId().equals(userId)) {
                members.remove(m);
                return true;
            }
        }
        return false;
    }

    public boolean searchMember(String name, String userId) {
        for (Member m : members) {
            if (m.getMembername().equals(name) && m.getId().equals(userId)) {
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

    public Member getMemberByName(String name, String userId) {
        for (Member m : members) {
            if (m.getMembername().equals(name) && m.getId().equals(userId)) {
                return m;
            }
        }
        return null;
    }

    public Member getMemberByIdAndPwd(String userId, String userPwd) {
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

    public void viewMemberPlaylist() {
        for (Member m : members) {
            if (!"admin".equals(m.getId())) {
                System.out.println(m);
                System.out.println(m.getMembername() + "님의 동영상 목록");
                for (Video v : m.getPlaylist()) {
                    System.out.println(v);
                }
            }
        }
    }
}
