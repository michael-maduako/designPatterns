package com.singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		
	}
	static {
		try {
			instance=new StaticBlockSingleton();
		}catch(Exception e){
			throw new RuntimeException("Exception occured");
		}
	}
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
