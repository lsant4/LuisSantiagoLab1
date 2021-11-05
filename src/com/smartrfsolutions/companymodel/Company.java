/**
 * 
 */
package com.smartrfsolutions.companymodel;

/**
 * @author luigi
 *
 */
public class Company {
	
	private String companyName; 
	private  Employee[] myEmployees; 
	
	public Company (String name) {
		this.companyName = name; 
	}
	public int numberofEmployees() {
		return 0; 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company mycompany = new  Company ("SmartRF Solutions"); 

	}

}
