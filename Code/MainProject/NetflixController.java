package com.kh.control;

import com.kh.vo.Member;
import com.kh.vo.Video;
import java.util.ArrayList;

public class NetflixController {
    private ArrayList<Video> vid = new ArrayList<>();
    private ArrayList<Member> mem = new ArrayList<>();

    public NetflixController() {
        // 초기 동영상 리스트를 설정
        vid.add(new Video("스위트홈", "공포", 18));
        vid.add(new Video("겨울왕국", "애니", 1));
        vid.add(new Video("타이타닉", "로맨스", 12));
        vid.add(new Video("인사이드 아웃", "애니", 1));
        vid.add(new Video("나는 솔로", "예능", 15));
        vid.add(new Video("조커", "느와르", 18));
        vid.add(new Video("신세계", "느와르", 18));
        vid.add(new Video("파묘", "공포", 18));
        vid.add(new Video("여신강림", "로맨스", 15));
        vid.add(new Video("솔로지옥", "예능", 15));
    }

    // 회원을 추가
    public void addMember(String name, String email, int age) {
        if (mem.size() >= 5) {
            System.out.println("회원이 가득 찼습니다. 더 이상 추가할 수 없습니다.");
            return;
        }
        mem.add(new Member(name, email, age));
        System.out.println("회원이 성공적으로 추가되었습니다.");
    }

    // 등록된 회원 목록을 출력함.
    public void printMembers() {
        for (Member m : mem) {
            System.out.println(m);
        }
    }

    // 회원을 삭제
    public boolean deleteMember(String name) {
        for (Member m : mem) {
            if (m.getMembername().equals(name)) {
                mem.remove(m);
                return true;
            }
        }
        return false;
    }

    // 회원을 검색하고 플레이리스트를 출력함.
    public void searchMember(String name) {
        for (Member m : mem) {
            if (m.getMembername().equals(name)) {
                System.out.println(m);
                System.out.println("플레이리스트: " + m.getPlaylist());
                return;
            }
        }
        System.out.println("해당 이름의 회원이 없습니다.");
    }

    // 동영상을 회원의 플레이리스트에 동영상을 추가함.
    public boolean saveVideo(String memberName, String videoName) {
        Member member = null;
        for (Member m : mem) {
            if (m.getMembername().equals(memberName)) {
                member = m;
                break;
            }
        }
        if (member == null) {
            return false;
        }

        for (Video v : vid) {
            if (v.getVideoname().equals(videoName)) {
                if (member.getAge() >= v.getLimitage()) {
                    member.addVideoToPlaylist(v);
                    return true;
                } else {
                    System.out.println("회원의 나이가 동영상의 나이 제한보다 적습니다.");
                    return false;
                }
            }
        }
        System.out.println("해당 이름의 동영상이 없습니다.");
        return false;
    }

    //회원의 플레이리스트에서 동영상을 삭제함
    public boolean deleteVideo(String memberName, String videoName) {
        Member member = null;
        for (Member m : mem) {
            if (m.getMembername().equals(memberName)) {
                member = m;
                break;
            }
        }
        if (member == null) {
            return false;
        }

        for (Video v : member.getPlaylist()) {
            if (v.getVideoname().equals(videoName)) {
                member.removeVideoFromPlaylist(v);
                return true;
            }
        }
        System.out.println("해당 이름의 동영상이 없습니다.");
        return false;
    }

    // 모든 회원과 플레이리스트를 출력하는 메소드
    public void viewMemberPlaylist() {
        for (Member m : mem) {
            System.out.println(m);
        }
    }

    // 등록된 동영상 목록을 출력하는 메소드
    public void printVideos() {
        for (Video v : vid) {
            System.out.println(v);
        }
    }

    // 회원이 존재하는지 확인하는 메소드
    public boolean isExistMember(String memberName) {
        for (Member m : mem) {
            if (m.getMembername().equals(memberName)) {
                return true;
            }
        }
        return false;
    }
}
