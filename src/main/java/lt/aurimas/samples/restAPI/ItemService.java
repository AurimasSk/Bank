package lt.aurimas.samples.restAPI;

import java.util.List;

public interface ItemService {
	
	/**
	 * @param item
	 * @return Item with id
	 */
	Item addItem(Item item);
	
	/**
	 * @param items - item list
	 */
	void addItems(List<Item> items);
	
	/**
	 * Unique item is resolved by its id
	 * 
	 * @param id - item id
	 * @return unique item by its id
	 */
	Item getItem(long id);
	
	/** 
	 * @param title - item title
	 * @return item list with given title
	 */
	List<Item> getItemsByTitle(String title);
	
	
	/**
	 * @param item
	 * @return item - updated item
	 */
	Item updateItem(Item item);
	
	/**
	 * Item is removed by its id
	 * 
	 * @param id - item id
	 */
	void removeItem(long id);

}
