package com.facade;
import java.util.*;
public class FacadeClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the dell or lenovo");
		String general= sc.nextLine();
		Factory f= new Factory();
		if(general.equals("dell"))
			f.dellPOS();
		else if (general.equals("lenovo"))
			f.lenovoPOS();
		else
			System.exit(0);
	}
}
