package lt.aurimas.samples.restAPI;

import java.util.Date;

public class Item {

	public Item() {
		
	}
	
	public Item(long id, String title, Double price, String itemType,
				String description, Date boughtTime) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.itemType = itemType;
		this.description = description;
		this.boughtTime = boughtTime;
	}

	private long id;
	
	private String title;
	
	private Double price;
	
	private String itemType;
	
	private String description;
	
	private Date boughtTime;

	public void setID(long id) {
		this.id = id;
	}
	
	public long getID() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getBoughtTime() {
		return boughtTime;
	}

	public void setBoughtTime(Date boughtTime) {
		this.boughtTime = boughtTime;
	}
	
}
