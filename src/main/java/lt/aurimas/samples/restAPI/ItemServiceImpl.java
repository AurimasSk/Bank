package lt.aurimas.samples.restAPI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.OptimisticLockException;

import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

	@Override
	public Item addItem(Item item) {
		item.setID(5);
		return item;
	}

	@Override
	public void addItems(List<Item> items) {
		
	}

	@Override
	public Item getItem(long id) {
		return new Item(id, "Item title", new Double("15"), "Item type", "Description", new Date());
	}

	@Override
	public List<Item> getItemsByTitle(String title) {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item((long)10, title, new Double("15"), "Item type", "Description", new Date()));
		items.add(new Item((long)11, title, new Double("15"), "Item type", "Description", new Date()));
		items.add(new Item((long)10, title, new Double("15"), "Item type", "Description", new Date()));
		items.add(new Item((long)12, title, new Double("15"), "Item type", "Description", new Date()));
		items.add(new Item((long)13, title, new Double("15"), "Item type", "Description", new Date()));
		return items;
	}

	@Override
	public Item updateItem(Item item) {
		item.setTitle("New title");
		return item;
	}

	@Override
	public void removeItem(long id) {
		throw new OptimisticLockException();
	}

}
