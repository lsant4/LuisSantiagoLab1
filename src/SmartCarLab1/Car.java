package SmartCarLab1;

import SmartCar.Car;

public class Car implements SelfCheckCapable {
	private String licensePlateNumber;
	private int year; 

	public static void moveForward () {
		System.out.println("moveForward");
	}	
	public static void moveBackward () {
			System.out.println("moveBackward");
	}
	public static void stop () {
		System.out.println("stop");
	}
	public static void turnRight () {
		System.out.println("turnRight");
	}
	public static void turnLeft () {
		System.out.println("turnLeft");
	}
	
	public boolean selfCheck() { 
		// TODO Auto-generated method stub
		return true; 
	}
	
	@Override 
	public String getComponentName() { 
		//TODO Auto-generated method stub
		String name = null; 
		return name; 
	}
		public boolean runSelfCheck() {
			//TODO Auto-generated method stub
			return true; 
		}
		
	
	public static void runDiagnostics () {
		System.out.println("All Systems Optimal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar=new Car(); 
		mycar.runDiagnostics();
		mycar.runSelfCheck();
	}
 
}
