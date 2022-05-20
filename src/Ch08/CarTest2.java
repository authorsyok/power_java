package Ch08;

class caar {
	private int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수버전 호출");
	}
	
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수버전 호출");
	}
}

public class CarTest2 {

	public static void main(String[] args) {

		caar myCar = new caar();
		
		myCar.setSpeed(100);	// 정수버전
		myCar.setSpeed(222.2);	// 실수버전
	}
}
