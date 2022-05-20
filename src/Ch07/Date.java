package Ch07;

public class Date {
	
	private int year;
	private String month;
	private int day;
	
	public void printDate() {
		System.out.println(year + "." + month + "." + day);
	}
	
	public int getDay() {
		return day;
	}
	
}
