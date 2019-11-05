package BuilderPatternComponents;

import java.util.List;

import Type.Item;

import java.util.ArrayList;

public class Creator {
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}