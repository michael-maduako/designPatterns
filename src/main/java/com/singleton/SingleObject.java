package com.singleton;

public class SingleObject {
	//eager instance
	private static SingleObject instance= new SingleObject();
	//For lazy instance
	//	(private static SingleObject instance;)

	
	
	private SingleObject() {
		System.out.println("calling zero arg constructor");
	}
	
	public static SingleObject getInstance() {
		//lazy initialization
		/*(if(instance ==null))
			instance= new SingleObject();
		*/
		return instance;
	}

		public static SingleObject showMessage() {
			System.out.println("Accessing object with only one instance! ");
			return instance;
		}

}

class Test{
	public static void main(String[] args) {
		SingleObject.getInstance();
		SingleObject.showMessage();
		
		
	}
}

