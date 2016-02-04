package demo.useractlog.dto;

public class CheckoutItem {

	private String item;
	private Integer quantity;

	public CheckoutItem() {

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
		return "CheckoutItem [item=" + item + ", quantity=" + quantity + "]";
	}

}