package test.t240715.object3;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		return "면적 : " + x +", "+ y +", "+ height + ", "+ width +  " / " + (width*height);
		
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		return "면적 : " + x +", "+ y +", "+ height + ", "+ width +  " / " + (2*(width+height));
	}

}
