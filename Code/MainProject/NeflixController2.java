package com.kh.control;

import java.util.ArrayList;

import com.kh.vo.Video;
import com.kh.vo.Member;

public class NetflixController {
    private ArrayList<Video> videos = new ArrayList<>();

    public NetflixController() {
        super();
        videos.add(new Video("스위트홈", "공포", 18));
        videos.add(new Video("미니언즈", "애니", 1));
        videos.add(new Video("타이타닉", "로맨스", 15));
        videos.add(new Video("인사이드 아웃", "애니", 1));
        videos.add(new Video("나는 솔로", "예능", 15));
        videos.add(new Video("조커", "느와르", 18));
        videos.add(new Video("신세계", "느와르", 18));
        videos.add(new Video("파묘", "공포", 18));
        videos.add(new Video("여신강림", "로맨스", 15));
        videos.add(new Video("솔로지옥", "예능", 15));
    }

    public void printAllVideos() {
        for (Video v : videos) {
            System.out.println(v);
        }
    }

    public boolean saveVideo(MemberController memberController, String memberName, String videoTitle) {
        Member member = memberController.getMemberByName(memberName);
        if (member == null) {
            System.out.println("해당 회원이 존재하지 않습니다.");
            return false;
        }

        for (Video v : videos) {
            if (v.getVideoname().equals(videoTitle)) {
                if (member.getAge() >= v.getLimitage()) {
                    member.addVideoToPlaylist(v);
                    return true;
                } else {
                    System.out.println("회원님의 나이가 동영상 나이제한에 걸립니다.");
                    return false;
                }
            }
        }
        System.out.println("해당 동영상이 존재하지 않습니다.");
        return false;
    }

    public boolean deleteVideo(MemberController memberController, String memberName, String videoTitle) {
        Member member = memberController.getMemberByName(memberName);
        if (member == null) {
            System.out.println("해당 회원이 존재하지 않습니다.");
            return false;
        }

        for (Video v : member.getPlaylist()) {
            if (v.getVideoname().equals(videoTitle)) {
                member.removeVideoFromPlaylist(v);
                return true;
            }
        }
        System.out.println("해당 동영상이 플레이리스트에 존재하지 않습니다.");
        return false;
    }
}
