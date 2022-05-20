package Ch09;

class Date {
	private int year;
	private String month;
	private int day;
	
	public Date() {
		year = 2009;
		month = "1¿ù";
		day = 1;
	}
	
	public Date(int year, String month, int day) {
		setDate(year, month, day);
	}
	
	public Date(int year) {
		setDate(year, "1¿ù", 1);
	}
	
	public void setDate(int year, String month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}

public class DateTest {

	public static void main(String[] args) {
		
		Date date1 = new Date(2009, "3¿ù", 2);
		Date date2 = new Date(2010);
		Date date3 = new Date();
	}

}
