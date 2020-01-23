package srp;
import java.util.*;

public class CalculateBillService {
	public long calculateBill(HashMap<String,Integer> purchasedItemsMap) {
		long totalBill=0;
		for(long itemPrice: purchasedItemsMap.values())
			totalBill += itemPrice;
		return totalBill;
	}
}
