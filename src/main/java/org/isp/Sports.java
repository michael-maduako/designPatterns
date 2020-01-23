package org.isp;

public class Sports {

	public static void main(String[] args) {
		Jumping j= new Jumping();
		System.out.println("Jummping tournament started");
		System.out.println(j.compete("Edson")+j.longJump());
		
		Racing r= new Racing();
		System.out.println("Racing tournament started");
		System.out.println(r.compete("Katik")+r.sprint());
		
		Swimming s= new Swimming();
		System.out.println("Swimming tournament started");
		System.out.println(s.compete("Mobusher")+s.swim());		
		
		
	}

}
