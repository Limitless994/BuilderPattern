package BuilderPatternComponents;

import java.util.List;
import java.util.ArrayList;

public class Product {
	   private List<Item> items = new ArrayList<Item>();	

	   public void addItem(Item item){
	      items.add(item);
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (Item item : items) {
	         cost += item.price();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
	      for (Item item : items) {
	         System.out.print("Item : " + item.name());
	         System.out.print(", Display : " + item.display().display());
	         System.out.println(", Price : " + item.price());
	      }		
	   }	
	}