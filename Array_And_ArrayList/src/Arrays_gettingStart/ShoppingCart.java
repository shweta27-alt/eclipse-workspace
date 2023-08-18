package Arrays_gettingStart;
import java.util.*;

public class ShoppingCart {
	private int[] array = new int[10];
	private ArrayList<String> shoppingCart = new ArrayList<>();
    
	private void addItem(String item) {
		shoppingCart.add(item);
	}
	
	public void printList() {
		System.out.println("There are "+ shoppingCart.size()+"items in your cart");
		for(int i=0;i<shoppingCart.size();i++) {
			System.out.println("Item no" + (i+1)+ "is" + shoppingCart.get(i));
		}
	}
	
	private void modifyCart(int position, String newItem) {
		shoppingCart.set(position,newItem);
		System.out.println("shopping Item "+(position + 1)+" has been updated");
	}
	
	private void removeItem(int position) {
		String itemName = shoppingCart.get(position);
		shoppingCart.remove(position);
	}
	
	private int searchItem(String SearchItem) {
		
		int position = shoppingCart.indexOf(SearchItem);
		return position;
	}
	
	
}
