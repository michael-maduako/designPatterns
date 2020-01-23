package com.factory;
import java.util.*;
public class GenerateBillClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		PlanFactory pFactory= new PlanFactory();
		System.out.println("Enter the name of the plan:");
		Scanner sc= new Scanner(System.in);
		String planName= sc.nextLine();
		System.out.println("Enter the name of units:");
		int units= Integer.parseInt(sc.nextLine());
		Plan p= pFactory.getPlan(planName);
		System.out.println("Bill amount for "+planName+" of " +units+" unit is:");
		p.getRate();
		p.calculateBill(units);
	}

}
