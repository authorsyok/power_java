package Ch07;

class Car {
	String color; // 색상
	int speed;	  // 현재 속도
	int gear;	  // 현재 기어
	
	void print() {
		System.out.println("( " + color + ", " + speed + ", " + gear + " )");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();	// 객체 생성
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();			// 객체 메소드 호출
	}
}
