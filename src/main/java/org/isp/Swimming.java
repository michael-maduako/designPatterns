package org.isp;

public class Swimming implements Athlete,Swimmers{

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return "in swimming";
	}

	@Override
	public String compete(String athleteName) {
		// TODO Auto-generated method stub
		return athleteName+"starting competing";
	}

}
