package Ch09;

class Time {
	private int hour;
	private int minute;
	private int second;
	
	// ù ��° ������
	public Time() {
		this(1, 0, 0);
	}
	
	// �� ��° ������
	public Time(int h, int m, int s) {
		setTime(h, m, s);
	}
	
	// �ð� ���� �Լ�
	public void setTime(int h, int m, int s) {
		hour = ((h >= 0 && h < 24) ? h : 0);	// �ð� ����
		minute = ((m >= 0 && m < 60) ? m : 0);	// �� ����
		second = ((s >= 0 && s < 60) ? s : 0);	// �� ����
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}

public class TimeTest {

	public static void main(String[] args) {

		Time time = new Time();
		
		System.out.print("�⺻ ������ ȣ�� �� �ð�: ");
		System.out.println(time.toString());
		
		Time time2 = new Time(12, 27, 6);
		System.out.print("�ι�° ������ ȣ�� �� �ð�: ");
		System.out.println(time2.toString());
		
		Time time3 = new Time(99, 88, 77);
		System.out.print("�ùٸ��� ���� �ð� ���� �� �ð�: ");
		System.out.println(time3.toString());
	}
}
