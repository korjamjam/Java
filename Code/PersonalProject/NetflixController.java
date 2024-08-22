package com.kh.control;

import java.util.ArrayList;
import java.util.Iterator;
import com.kh.vo.Member;
import com.kh.vo.Video;

public class NetflixController {
	private ArrayList<Video> videos = new ArrayList<>();
	
	/*미리 등록된 동영상 (장르별, 나이제한별로 출력해볼까?)*/
	public NetflixController() {
		super();
		videos.add(new Video("스위트홈", "공포", 18));
		videos.add(new Video("신세계", "느와르", 18));
		videos.add(new Video("파묘", "공포", 18));
		videos.add(new Video("타이타닉", "로맨스", 15));
		videos.add(new Video("여신강림", "로맨스", 15));
		videos.add(new Video("솔로지옥", "예능", 15));
		videos.add(new Video("미니언즈", "만화", 1));
		videos.add(new Video("이웃집토토로", "만화", 1));
		videos.add(new Video("인사이드 아웃", "만화", 1));
	}

	/*등록된 모든 동영상 출력*/
	public void printAllVideos() {
		for (Video v : videos) {
			System.out.println(v);
		}
	}
	
	/*플레이리스트에 동영상 저장 기능*/
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

	/*플레이리스트에 동영상 삭제 기능*/	
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

	/*관리자 계정으로 동영상 추가 기능*/
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

	/*관리자 계정으로 동영상 삭제 기능*/
//	public void removeVideo(String videoTitle) {
//		for (Video v : videos) {
//			if (v.getVideoname().equals(videoTitle)) {
//				videos.remove(v);
//				System.out.println("동영상이 성공적으로 삭제되었습니다.");
//				break;
//			} else {
//				System.out.println("존재하지 않는 동영상입니다.");
//				return;
//			}
//		}
//	}
//  순서대로 입력해야만 삭제가 되서 폐기
	
	public void removeVideo(String videoTitle) {
        Iterator<Video> iterator = videos.iterator();
        while (iterator.hasNext()) {
            Video v = iterator.next();
            if (v.getVideoname().equals(videoTitle)) {
                iterator.remove(); 
                System.out.println("동영상이 성공적으로 삭제되었습니다.");
                return;
            }
        }
        System.out.println("존재하지 않는 동영상입니다.");
    }
	
	/*Iterator의 hasNext() 메서드를 사용하여 리스트의 다음 요소가 있는지 확인하고,
	 * next() 메서드로 해당 요소를 가져온다.*/
		
}









