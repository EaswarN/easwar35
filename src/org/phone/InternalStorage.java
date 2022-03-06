package org.phone;

public class InternalStorage {

	private void processorName() {
		System.out.println("intel");		
	}
	private void ramSize() {
		System.out.println("8gb");

	}
	
	public static void main(String[] args) {
		
		InternalStorage phone = new InternalStorage();
		phone.processorName();
		phone.ramSize();
	
		ExternalStorage phone = new InternalStorage();		
		
		
		
	}
		
		
		
		
		
		
		
	
	
	
}
