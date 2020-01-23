package com.factory;



//Create an API for the Client
public class PlanFactory {
	public Plan getPlan(String planType) {
		if(planType==null)
			return null;
		if(planType.equals("ResidentialPlan"))
			return new ResidentialPlan();
		if(planType.equals("CommercialPlan"))
			return new CommercialPlan();
		if(planType.equals("StateGovernment"))
			return new StateGovernment();
		
		return null;
	}
}
