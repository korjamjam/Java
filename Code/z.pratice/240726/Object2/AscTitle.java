package test.t240726.object2;

import java.util.Comparator;

public class AscTitle implements Comparator<Music>{

	public int compare(Music o1, Music o2) {
		//compareTo -> 나자신과 비교해서 크면 1 작으면 -1 같으면 0
		return o1.getTitle().compareTo(o2.getTitle());
	}

}