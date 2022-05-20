class car {
	private String color;
	private int speed;
	private int gear;
	
	public String getColor()  		{ return color; }
	public void setColor(String c) 	{ color = c; 	}
	
	public int getSpeed() 			{ return speed; }
	public void setSpeed(int s) 	{ speed = s;    }
	
	public int getGear()			{ return gear;  }
	public void setGear(int g)		{ gear = g;     }
	
}

public class practice {

	public static void main(String[] args) {
		
		car myCar = new car();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		System.out.println("색상은 " + myCar.getColor());
		System.out.println("속도는 " + myCar.getSpeed());
		System.out.println("기어는 " + myCar.getGear());
		
	}

}
