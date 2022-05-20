package Ch09;

class Time {
	private int hour;
	private int minute;
	private int second;
	
	// 첫 번째 생성자
	public Time() {
		this(1, 0, 0);
	}
	
	// 두 번째 생성자
	public Time(int h, int m, int s) {
		setTime(h, m, s);
	}
	
	// 시간 설정 함수
	public void setTime(int h, int m, int s) {
		hour = ((h >= 0 && h < 24) ? h : 0);	// 시간 검증
		minute = ((m >= 0 && m < 60) ? m : 0);	// 분 검증
		second = ((s >= 0 && s < 60) ? s : 0);	// 초 검증
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}

public class TimeTest {

	public static void main(String[] args) {

		Time time = new Time();
		
		System.out.print("기본 생성자 호출 후 시간: ");
		System.out.println(time.toString());
		
		Time time2 = new Time(12, 27, 6);
		System.out.print("두번째 생성자 호출 후 시간: ");
		System.out.println(time2.toString());
		
		Time time3 = new Time(99, 88, 77);
		System.out.print("올바르지 않은 시간 설정 후 시간: ");
		System.out.println(time3.toString());
	}
}
