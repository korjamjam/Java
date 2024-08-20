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

	public boolean saveVideo(MemberController mc, String memberName, String userId, String videoTitle) {
		Member member = mc.getMemberByName(memberName, userId);
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

	public boolean deleteVideo(MemberController mc, String memberName, String userId, String videoTitle) {
		Member member = mc.getMemberByName(memberName, userId);
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

	public void addVideo(String videoTitle, String genre, int limitAge) {
		for (Video v : videos) {
			if (!(v.getVideoname().equals(videoTitle))) {
				videos.add(new Video(videoTitle, genre, limitAge));
				System.out.println("동영상이 성공적으로 추가되었습니다.");
				break;
			} else {
				System.out.println("중복되는 이름의 동영상이 존재합니다");
				return;
			}
		}
	}

	public void removeVideo(String videoTitle) {
		for (Video v : videos) {
			if (v.getVideoname().equals(videoTitle)) {
				videos.remove(v);
				System.out.println("동영상이 성공적으로 삭제되었습니다.");
				break;
			} else {
				System.out.println("존재하지 않는 동영상입니다.");
				return;
			}
		}
	}
}









