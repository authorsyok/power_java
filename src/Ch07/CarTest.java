package Ch07;

class Car {
	String color; // ����
	int speed;	  // ���� �ӵ�
	int gear;	  // ���� ���
	
	void print() {
		System.out.println("( " + color + ", " + speed + ", " + gear + " )");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();	// ��ü ����
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();			// ��ü �޼ҵ� ȣ��
	}
}
