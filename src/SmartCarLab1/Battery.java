package SmartCarLab1;

import edu.fiu.sysdesign.SelfCheckCapable; 

public class Battery implements SelfCheckCapable{
	
	
	public Battery(String type) 
	{
		this.type = type; 
	}
 
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
	public boolean selfCheck() {
		//TODO Auto-generated method stub 
		return true; 
	}
 	public String getComponentName() {
 		//TODO Auto-generated method stub
 		String name = null; 
 		return name; 
 	}
 	public boolean runSelfCheck() {
 		//TODO Auto-generated method stub
 		return true; 
 	}
}
