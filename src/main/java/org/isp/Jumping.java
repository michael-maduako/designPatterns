package org.isp;

public class Jumping implements Athlete,Jumpers {

	@Override
	public String compete(String athleteName) {
		
		return athleteName+"started competing";
	}
	
	public String longJump() {
		return "in long jump.";
	}
	
	public String highJump() {
		return "in high jump.";
	}
	
}
