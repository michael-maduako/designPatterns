package org.isp;

public class Racing implements Athlete {

	@Override
	public String compete(String athleteName) {
		// TODO Auto-generated method stub
		return athleteName+"start competing";
	}
	
	
	public String relayRace() {
		return "in relay racing.";
	}
	
	public String sprint() {
		return "sprint";
	}
	
	public String hundredMeters() {
		return "in 100 meters";
	}
	
	public String fourhundredMeters() {
		return "in 400 meters";

	}
	
}
