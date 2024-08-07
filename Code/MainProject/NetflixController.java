package com.kh.control;

import java.util.ArrayList;

import com.kh.vo.Member;
import com.kh.vo.Video;

public class NetflixController {
    private ArrayList<Video> vid = new ArrayList<>();
    private ArrayList<Member> mem = new ArrayList<>();

    public NetflixController() {
        super();
        vid.add(new Video("스위트홈", "공포", 18));
        vid.add(new Video("미니언즈", "애니", 1));
        vid.add(new Video("타이타닉", "로맨스", 15));
        vid.add(new Video("인사이드 아웃", "애니", 1));
        vid.add(new Video("나는 솔로", "예능", 15));
        vid.add(new Video("조커", "느와르", 18));
        vid.add(new Video("신세계", "느와르", 18));
        vid.add(new Video("파묘", "공포", 18));
        vid.add(new Video("여신강림", "로맨스", 15));
        vid.add(new Video("솔로지옥", "예능", 15));
    }

    public void addMember(String name, String email, int age) {
        if (mem.size() < 5) {
            mem.add(new Member(name, email, age));
            System.out.println("회원이 성공적으로 추가되었습니다.");
        } else {
            System.out.println("회원이 가득 찼습니다.");
        }
    }

    public void printMember() {
        for (Member m : mem) {
            System.out.println(m);
        }
    }

    public boolean deleteMember(String name) {
        for (Member m : mem) {
            if (m.getMembername().equals(name)) {
                mem.remove(m);
                return true;
            }
        }
        return false;
    }

    public boolean searchMember(String name) {
        for (Member m : mem) {
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

	public boolean saveVideo(String memberName, String videoTitle) {
		for (Member m : mem) {
			for (Video v : vid) {
			if (m.getMembername().equals(memberName)) {
					if (v.getVideoname().equals(videoTitle)) {
						if (m.getAge() >= v.getLimitage()) {
							m.addVideoToPlaylist(v);
							return true;
							
						}else {
							System.out.println("회원님의 나이가 동영상 나이제한에 걸립니다.");
							return false;
						}
					}
				}
			}
		}
		return false;
	}

    public boolean deleteVideo(String memberName, String videoTitle) {
        for (Member m : mem) {
            if (m.getMembername().equals(memberName)) {
                for (Video v : m.getPlaylist()) {
                    if (v.getVideoname().equals(videoTitle)) {
                        m.removeVideoFromPlaylist(v);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void viewAllMemberPlaylists() {
        for (Member m : mem) {
            System.out.println(m);
            System.out.println(m.getMembername() + "님의 동영상 목록");
            for (Video v : m.getPlaylist()) {
                System.out.println(v);
            }
            System.out.println("==============================================");
        }
    }

    public void printAllVideos() {
        for (Video v : vid) {
            System.out.println(v);
        }
    }

    public boolean printMemberPlaylist(String name) {
        for (Member m : mem) {
            if (m.getMembername().equals(name)) {
                for (Video v : m.getPlaylist()) {
                    System.out.println(v);
                }
                return true;
            }
        }
        return false;
    }
    
}
