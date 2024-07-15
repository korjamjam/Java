package test.t240715.object3;

public class CircleController {
	Circle c = new Circle();
	static final double PI = 3.141592;
	
	//원의 넓이
	public String calcArea(int x, int y, int radius) {
		return "면적 : " + x +", "+ y +", "+ radius + " / " + (PI*radius*radius);
	}
	
	//원의 둘레
	public String calcCircum(int x, int y, int radius) {
		return "둘레 : " + x +", "+ y +", "+ radius + " / " + (PI*radius*2);
	}

}
