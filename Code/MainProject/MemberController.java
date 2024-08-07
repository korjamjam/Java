package com.kh.control;

import java.util.ArrayList;
import com.kh.vo.Member;
import com.kh.vo.Video;

public class MemberController {
    private ArrayList<Member> members = new ArrayList<>();

    public void addMember(String name, String email, int age) {
        if (members.size() < 5) {
            members.add(new Member(name, email, age));
            System.out.println("회원이 성공적으로 추가되었습니다.");
        } else {
            System.out.println("회원이 가득 찼습니다.");
        }
    }

    public void printMembers() {
        for (Member m : members) {
            System.out.println(m);
        }
    }

    public boolean deleteMember(String name) {
        for (Member m : members) {
            if (m.getMembername().equals(name)) {
                members.remove(m);
                return true;
            }
        }
        return false;
    }

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
}
