package demo.useractlog.dto;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public class CheckOutItem {

	private String item;
	private Integer quantity;

	public CheckOutItem() {
		
	} 
	
	public CheckOutItem(String item, Integer quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CheckOutItem [" + (item != null ? "item=" + item + ", " : "")
				+ (quantity != null ? "quantity=" + quantity : "") + "]";
	}

	/*
	 * public String toString() { return "CheckoutItem [item=" + item + ", quantity=" + quantity +
	 * "]"; }
	 */

}
