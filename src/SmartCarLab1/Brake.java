package SmartCarLab1;

import edu.fiu.sysdesign.SelfCheckCapable;

public class Brake implements SelfCheckCapable {
	
	private String type;  
	
	public Brake(String type) 
	{
		this.type = type; 
	}
	public void apply(){
		System.out.println("apply");
}
	public boolean selfCheck() { 
		// TODO Auto-generated method stub
		return true; 
	}
	public String getComponentName() {
		//TODO Auto-generated method stub
		String name = null; 
		return name;
	}
	public boolean runSelfCheck() { 
		// TODO Auto-generated method stub
				return true;
	}
}
