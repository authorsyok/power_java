package Ch09;

class Car {
	private String color;
	private int speed;
	private int gear;
	
	// �ڵ��� �ø��� ��ȣ
	private int id;
	
	// ��üȭ�� Car ��ü�� ������ ���� ���� ����
	private static int numberOfCars = 0;
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		
		// �ڵ����� ������ �����ϰ� id ��ȣ�� �Ҵ��Ѵ�.
		id = ++numberOfCars;
	}
	
	// ���� �޼ҵ�
	public static int getNumberOfCars() {
		return numberOfCars;
	}
}

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car("blue", 100, 1);		// ù��° ������ ȣ��
		Car c2 = new Car("white", 100, 1);		// �ι�° ������ ȣ��
		
		int n = Car.getNumberOfCars();			// ���� �޼ҵ� ȣ��
		System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);
	}
}
