package srp;

import java.util.*;
public class PlaceOrderService {

	public void placeOrder(HashMap<String,Integer> purchasedItemsMap) {
		System.out.println("\nYou have purchased these items: ");
		
		purchasedItemsMap.forEach((itemName, itemPrice)->{
			System.out.println("Item: "+itemName+" Price: "+itemPrice);
		});
		
		System.out.println();
	}
}
