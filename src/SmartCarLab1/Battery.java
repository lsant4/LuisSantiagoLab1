package SmartCarLab1;

public class Battery {
	private String type;
	private float capacity; 
	private String batteryStatus; 
	
	public void charge () {
		System.out.println("charge");
	}	
	public void turnOn () {
			System.out.println("turnOn");
	}
	public void turnOff () {
		System.out.println("turnOff");
	}
	public void checkBatteryStatus () {
		System.out.println("checkBatteryStatus");
}
}
